package com.pyh.purchase_ribbon;

import com.netflix.discovery.DiscoveryClient;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class PurchaseRibbonApplicationTests {

	@Resource
	private DiscoveryClient discoveryClient;

	@Test
	void contextLoads() {
		List<String> res=discoveryClient.getDiscoveryServiceUrls("http://eureka-server.com:8081/eureka/");
		for (String s:res)
		{
			System.out.println(s);
		}
	}

}
