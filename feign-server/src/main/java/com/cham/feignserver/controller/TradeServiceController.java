package com.cham.feignserver.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TradeServiceController {

    @GetMapping(value = "/api/stream/trades", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.ACCEPTED)
    public String getTradeStream() {
        System.out.println("Inside TradeServiceController.getTradeStream..");
        return "Billion Trade";
    }
}
