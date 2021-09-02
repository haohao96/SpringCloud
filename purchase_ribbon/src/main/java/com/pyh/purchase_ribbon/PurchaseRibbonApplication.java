package com.pyh.purchase_ribbon;

import com.pyh.ribbonrule.RibbonRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
public class PurchaseRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PurchaseRibbonApplication.class, args);
	}

}
