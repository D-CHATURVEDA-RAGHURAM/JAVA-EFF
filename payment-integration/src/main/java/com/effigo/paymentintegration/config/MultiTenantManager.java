package com.effigo.paymentintegration.config;

import com.effigo.paymentintegration.security.AppSecretKey;
import com.zaxxer.hikari.HikariDataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class MultiTenantManager implements ApplicationListener<ContextRefreshedEvent>{

    private static final Logger logger = LoggerFactory.getLogger(MultiTenantManager.class);

    private final Map<Object, Object> tenantDataSources = new ConcurrentHashMap<>();
    public static final String DB_SCHEMA_NAME="?currentSchema=";

    @Autowired
    private AppRoutingDataSource routingDataSource;

    @Autowired
    private ServerProperties serverProperties;

    @Autowired
    private AppSecretKey appSecretKey;

    public void setCurrentTenant(String tenantId)  {
        if (tenantIsAbsent(tenantId)) {
            throw new RuntimeException("No tenant with ID " + tenantId);
        }

        routingDataSource.setCurrentTenant(tenantId);
        logger.info("Tenant '{}' set as current.", tenantId);
    }


    public void addTenant(String tenantId, String driverClassName,String url, String username, String password,String schema) throws SQLException {

        if(!ObjectUtils.isEmpty(schema)){
            String urlSchema=DB_SCHEMA_NAME.concat(schema);
            url=url.concat(urlSchema);
        }

        HikariDataSource dataSource=new HikariDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setPoolName(tenantId.concat(" DB Pool"));
        dataSource.setMaximumPoolSize(1);
        dataSource.setAllowPoolSuspension(true);
        dataSource.setMinimumIdle(5);
        dataSource.setConnectionTimeout(300000);
        dataSource.setMaxLifetime(900000);
        dataSource.setConnectionTestQuery("SELECT 1");

        try(Connection c = dataSource.getConnection()) {
            tenantDataSources.put(tenantId, dataSource);
            routingDataSource.setTargetDataSources(tenantDataSources);
            routingDataSource.afterPropertiesSet();
            logger.info("Tenant '{}' added.", tenantId);
        }
    }

    public DataSource removeTenant(String tenantId) {
        Object removedDataSource = tenantDataSources.remove(tenantId);
        routingDataSource.setTargetDataSources(tenantDataSources);
        routingDataSource.afterPropertiesSet();
        return (DataSource) removedDataSource;
    }

    public boolean tenantIsAbsent(String tenantId) {
        return !tenantDataSources.containsKey(tenantId);
    }

    public Collection<Object> getTenantList() {
        return tenantDataSources.keySet();
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        try {

            Map<String, ServerProperties.DataSourceDetails> dataSourceDetailsMap=serverProperties.getDatasources();

            for(String tenantId:dataSourceDetailsMap.keySet()){
                ServerProperties.DataSourceDetails ds=dataSourceDetailsMap.get(tenantId);
                try {
                    addTenant(tenantId, ds.getDriverClassName(),ds.getJdbcUrl(), ds.getUsername(), decryptDBPassword(tenantId,ds.getPassword()),ds.getSchema());
                }catch (Exception e) {
                    logger.error("error occurred while adding tenant {}", e);
                }
            }

        } catch (Exception e ) {
        	logger.error("error occurred while adding tenant {}", e);
        }
    }

    private String decryptDBPassword(String tenantId,String encryptedDBPassword){
        String decryptedDBPassword=appSecretKey.decryptProperty(encryptedDBPassword,serverProperties.getAccessKey());
        return decryptedDBPassword;
    }
}
