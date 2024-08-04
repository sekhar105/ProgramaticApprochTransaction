package com.springTransctional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringTransctionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransctionalApplication.class, args);
	}

}
