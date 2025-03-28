package com.effigo.paymentintegration.config;


import com.effigo.paymentintegration.security.AppSecretKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Configuration
public class DataSourceConfig {

    @Autowired
    private ServerProperties serverProperties;

    @Autowired
    private AppSecretKey appSecretKey;

    private final static String DEFAULT_DATASOURCE = "default";

    @Bean
    public AppRoutingDataSource dataSource() {
        AppRoutingDataSource multiTenantDataSource = new AppRoutingDataSource();

        multiTenantDataSource.setTargetDataSources(new ConcurrentHashMap<>());
        multiTenantDataSource.setDefaultTargetDataSource(defaultDataSource());
        multiTenantDataSource.afterPropertiesSet();

        return multiTenantDataSource;
    }


    private DriverManagerDataSource defaultDataSource() {
        DriverManagerDataSource defaultDataSource = new DriverManagerDataSource();
        Map<String, ServerProperties.DataSourceDetails> dataSourceDetailsMap = serverProperties.getDatasources();

        for (String tenantId : dataSourceDetailsMap.keySet()) {
            if (tenantId.equalsIgnoreCase(DEFAULT_DATASOURCE)) {
                ServerProperties.DataSourceDetails ds = dataSourceDetailsMap.get(tenantId);
                defaultDataSource.setDriverClassName(ds.getDriverClassName());
                defaultDataSource.setUrl(ds.getJdbcUrl());
                defaultDataSource.setUsername(ds.getUsername());
                defaultDataSource.setPassword(decryptDBPassword(tenantId, ds.getPassword()));
                break;
            }
        }

        return defaultDataSource;
    }

    private String decryptDBPassword(String tenantId, String encryptedDBPassword) {
        String decryptedDBPassword = appSecretKey.decryptProperty(encryptedDBPassword, serverProperties.getAccessKey());
        return decryptedDBPassword;
    }
}
