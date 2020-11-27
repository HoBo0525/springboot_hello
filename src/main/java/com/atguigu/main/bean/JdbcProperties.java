package com.atguigu.main.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Hobo
 * @create 2020-11-24 19:32
 */
@Component
@ConfigurationProperties(prefix = "spring.jdbc")
public class JdbcProperties {

    private DataSourceProperties datasource;
    private String type;

    @Override
    public String toString() {
        return "JdbcProperties{" +
                "datasource=" + datasource +
                ", type='" + type + '\'' +
                '}';
    }

    public DataSourceProperties getDatasource() {
        return datasource;
    }

    public void setDatasource(DataSourceProperties datasource) {
        this.datasource = datasource;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
