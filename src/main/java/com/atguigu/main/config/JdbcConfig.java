package com.atguigu.main.config;

import com.atguigu.main.bean.DataSourceProperties2;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author Hobo
 * @create 2020-11-24 19:30
 */
@SpringBootConfiguration
public class JdbcConfig {

    @Bean
    @ConfigurationProperties(prefix = "spring.jdbc.datasource")
    public DataSourceProperties2 createDataSourceProperties2(){
        return new DataSourceProperties2();
    }
}
