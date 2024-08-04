package com.springTransctional.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.support.TransactionTemplate;

public class AppConfigProgramaticApproch2 {

	@Bean
	public PlatformTransactionManager userTransctoinManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
	
	
	// here we are using template this tempalte reduce all the boiler plate logic used in approch 1
	@Bean
	public TransactionTemplate transactionTemplate(PlatformTransactionManager platformTransactionManager) {
		return new TransactionTemplate(platformTransactionManager);
	}
}
