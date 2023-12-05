package com.example.Main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.example.*")
@EnableJpaRepositories(basePackages ="com.example.repository")
@PropertySource("classpath:application.yaml")
@EntityScan("com.example.entitys")  

public class ScanAppetiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScanAppetiteApplication.class, args);
	}

}
