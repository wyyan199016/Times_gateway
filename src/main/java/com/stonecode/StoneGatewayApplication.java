package com.stonecode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class StoneGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoneGatewayApplication.class, args);
	}
}
