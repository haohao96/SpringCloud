package com.pyh.paymentcon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class PaymentConsulCont {

    @Value("${server.port}")
    private String serverport;

    private Random random=new Random(7);

    @RequestMapping("/paymentconsul")
    public String paymentconsul()
    {
        return "spring cloud with consul,server port:"+serverport+"--"+ random.nextInt(7);
    }
}

