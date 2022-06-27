package com.api.mercadona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.api.mercadona.dao.ProductDAO;

@SpringBootApplication
public class MercadonaApplication {
		
	@Autowired
	ProductDAO repository;

	public static void main(String[] args) {
		SpringApplication.run(MercadonaApplication.class, args);
	}
	
}
