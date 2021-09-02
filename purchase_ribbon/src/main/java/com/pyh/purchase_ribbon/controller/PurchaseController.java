package com.pyh.purchase_ribbon.controller;


import com.pyh.comutils.json.ComResult;
import com.pyh.comutils.pojo.Payment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class PurchaseController {

//    单机版
//    public static final String PAYMENT_URL="http://localhost:2222";

//    集群版
    public static final String PAYMENT_URL="http://PAYMENTSERVICE";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/purchase/create")
    public ComResult<Payment> create(Payment payment)
    {
        return restTemplate.postForObject(PAYMENT_URL+"/create",payment,ComResult.class);
    }

    @GetMapping("/purchase/select/{id}")
    public ComResult<Payment> getPayment(@PathVariable("id")Long id)
    {
        return restTemplate.getForObject(PAYMENT_URL+"/select/"+id,ComResult.class);
    }

    @GetMapping("/purchase/selectentity/{id}")
    public ComResult<Payment> getPaymentWithEntity(@PathVariable("id")Long id)
    {
        ResponseEntity<ComResult> entity= restTemplate.getForEntity(PAYMENT_URL+"/select/"+id,ComResult.class);
        if (entity.getStatusCode().is2xxSuccessful())
        {
            return entity.getBody();
        }
        else
        {
            return new ComResult<>(777,"操作失败");
        }
    }

}
