package com.pyh.purchaseconsul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PurchaseConsulCont {

    @Resource
    private RestTemplate restTemplate;

    public static final String INVOKE_URL="http://paymentconsul";

    @RequestMapping("/purchaseconsul")
    public String purchaseconsul()
    {
        String res=restTemplate.getForObject(INVOKE_URL+"/paymentconsul",String.class);
        return res;
    }
}
