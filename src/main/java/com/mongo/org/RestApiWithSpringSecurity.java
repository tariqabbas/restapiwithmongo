package com.mongo.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = { "com.mongo" })
@EnableJpaRepositories({ "com.mongo" })
@EntityScan(basePackages = {"com.mongo"})
public class RestApiWithSpringSecurity {

	public static void main(String[] args) {
		SpringApplication.run(RestApiWithSpringSecurity.class, args);
	}

}
