package com.example.ecommerce;

import com.example.ecommerce.dao.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEcommerceApplication.class, args);
	}

	@Bean
	public CommandLineRunner testDatabaseConnection(ProductRepository productRepository) {
		return args -> {
			long count = productRepository.count();
			System.out.println("Product count in DB = " + count);
		};
	}
}
