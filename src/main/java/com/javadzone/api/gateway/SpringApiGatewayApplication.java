package com.javadzone.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringApiGatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringApiGatewayApplication.class, args);
	}
}
