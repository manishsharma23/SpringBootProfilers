package com.profile.bean.datasources;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppDataSourcesConfig {
	@Bean
	@Profile("mysql")
	public DataSource oracleDataSource() {
		System.out.println(" myslq ds");
		DataSource mysqlDS = null;
		return mysqlDS;
	}

	@Bean
	@Profile("elastic")
	public DataSource elasticDataSource() {
		System.out.println(" elastic ds");
		DataSource elasticDS = null;
		return elasticDS;
	}
}
