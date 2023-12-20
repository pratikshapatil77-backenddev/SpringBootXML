package com.csi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExternalApiExApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalApiExApplication.class, args);
	}

}
