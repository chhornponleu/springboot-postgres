package com.example.springbootpostgres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class SpringbootPostgresApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootPostgresApplication.class, args);
	}
}
