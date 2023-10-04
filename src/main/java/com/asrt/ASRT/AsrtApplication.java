package com.asrt.ASRT;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan(basePackages = "com.asrt.ASRT.model")
@SpringBootApplication  
public class AsrtApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsrtApplication.class, args);
	}

}
