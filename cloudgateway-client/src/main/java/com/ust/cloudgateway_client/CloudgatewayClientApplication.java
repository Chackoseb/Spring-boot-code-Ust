package com.ust.cloudgateway_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CloudgatewayClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudgatewayClientApplication.class, args);
	}
	
	@Bean
	public RestTemplate newTemplate() {
		return new RestTemplate();
	}

}
