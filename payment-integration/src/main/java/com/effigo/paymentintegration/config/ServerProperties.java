package com.effigo.paymentintegration.config;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "tenants")
public class ServerProperties {
    private String accessKey;
    private Map<String, DataSourceDetails> datasources;
    private Map<String, ExternalLinks> externallinks;
    private Map<String, SecurityDetails> security;
    private List<String> excludebasicauthurls;
    private Map<String,InternalLinks>   internallinks;

    public List<String> getExcludebasicauthurls() {
        return excludebasicauthurls;
    }

    public void setExcludebasicauthurls(List<String> excludebasicauthurls) {
        this.excludebasicauthurls = excludebasicauthurls;
    }

    public Map<String, ExternalLinks> getExternallinks() {
        return externallinks;
    }

    public void setExternallinks(Map<String, ExternalLinks> externallinks) {
        this.externallinks = externallinks;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public Map<String, DataSourceDetails> getDatasources() {
        return datasources;
    }

    public void setDatasources(Map<String, DataSourceDetails> datasources) {
        this.datasources = datasources;
    }


    public Map<String, SecurityDetails> getSecurity() {
        return security;
    }

    public void setSecurity(Map<String, SecurityDetails> security) {
        this.security = security;
    }

    public Map<String, InternalLinks> getInternallinks() {
        return internallinks;
    }

    public void setInternallinks(Map<String, InternalLinks> internallinks) {
        this.internallinks = internallinks;
    }

    public static class ExternalLinks {

        private ApiInfo api;
        private SoapInfo soap;
        private FtpInfo ftp;

        public ApiInfo getApi() {
            return api;
        }

        public void setApi(ApiInfo api) {
            this.api = api;
        }

        public SoapInfo getSoap() {
            return soap;
        }

        public void setSoap(SoapInfo soap) {
            this.soap = soap;
        }

        public FtpInfo getFtp() {
            return ftp;
        }

        public void setFtp(FtpInfo ftp) {
            this.ftp = ftp;
        }

        public static class ApiInfo {
            private String username;
            private String password;
            private String accesskey;
            private Map<String, String> links;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getAccesskey() {
                return accesskey;
            }

            public void setAccesskey(String accesskey) {
                this.accesskey = accesskey;
            }

            public Map<String, String> getLinks() {
                return links;
            }

            public void setLinks(Map<String, String> links) {
                this.links = links;
            }
        }

        public static class SoapInfo {
            private String username;
            private String password;
            private String accesskey;
            private Map<String, String> links;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getAccesskey() {
                return accesskey;
            }

            public void setAccesskey(String accesskey) {
                this.accesskey = accesskey;
            }

            public Map<String, String> getLinks() {
                return links;
            }

            public void setLinks(Map<String, String> links) {
                this.links = links;
            }
        }

        public static class FtpInfo {
            private String username;
            private String password;
            private String accesskey;
            private Map<String, String> links;

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public String getPassword() {
                return password;
            }

            public void setPassword(String password) {
                this.password = password;
            }

            public String getAccesskey() {
                return accesskey;
            }

            public void setAccesskey(String accesskey) {
                this.accesskey = accesskey;
            }

            public Map<String, String> getLinks() {
                return links;
            }

            public void setLinks(Map<String, String> links) {
                this.links = links;
            }
        }
    }


    public static class DataSourceDetails {
        private String jdbcUrl;
        private String driverClassName;
        private String username;
        private String password;
        private String schema;

        public String getJdbcUrl() {
            return jdbcUrl;
        }

        public void setJdbcUrl(String jdbcUrl) {
            this.jdbcUrl = jdbcUrl;
        }

        public String getDriverClassName() {
            return driverClassName;
        }

        public void setDriverClassName(String driverClassName) {
            this.driverClassName = driverClassName;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getSchema() {
            return schema;
        }

        public void setSchema(String schema) {
            this.schema = schema;
        }
    }

    public static class SecurityDetails {
        private String username;
        private String password;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }
    }


    public static class InternalLinks {
        private Api api;

        public Api getApi() {
            return api;
        }

        public void setApi(Api api) {
            this.api = api;
        }
    }

    public static class Api {
        private String username;
        private String password;
        private String accesskey;
        private Map<String,String> links;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getAccesskey() {
            return accesskey;
        }

        public void setAccesskey(String accesskey) {
            this.accesskey = accesskey;
        }

        public Map<String, String> getLinks() {
            return links;
        }

        public void setLinks(Map<String, String> links) {
            this.links = links;
        }
    }
}
