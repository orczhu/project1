package com.zhu.project1.config;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class PersistenceConfig {
//    @Bean
//    public DataSource dataSource() {
//        return DataSourceBuilder.create().url("jdbc:postgresql://localhost:5432/conference_app").build();
//    }
}
