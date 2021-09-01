package com.pyh.purchaseconsul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PurchaseConsulApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseConsulApplication.class, args);
	}

}
