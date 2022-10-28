package com.training;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ProductAppFinal2ReviewsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductAppFinal2ReviewsApplication.class, args);
		System.out.println("###Reviews App running on 9091");
	}

}