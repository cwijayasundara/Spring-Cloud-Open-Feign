package com.cham.feignclientapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class TradeConsumerController {

    @Autowired
    private TradeFeignClient tradeFeignClient;

    @GetMapping(value = "/api/feign/trades", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getTradesViaFeignClient() {
        System.out.println("Inside TradeConsumerController.getTradesViaFeignClient..");
        return tradeFeignClient.getTrades();
    }
}
