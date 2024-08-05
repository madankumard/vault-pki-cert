package com.example.vaultpkicert.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hashi-vault")
public class HashiVaultConfig {

    private String dbid;
    private String dbpid;

    public String getDbid() {
        return dbid;
    }

    public void setDbid(String dbid) {
        this.dbid = dbid;
    }

    public String getDbpid() {
        return dbpid;
    }

    public void setDbpid(String dbpid) {
        this.dbpid = dbpid;
    }
}
