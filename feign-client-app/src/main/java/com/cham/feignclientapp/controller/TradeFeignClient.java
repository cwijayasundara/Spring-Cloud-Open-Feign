package com.cham.feignclientapp.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@FeignClient("tradeservice")
public interface TradeFeignClient {
    @RequestMapping( method= RequestMethod.GET,value="/api/stream/trades",consumes="application/json")
    public String getTrades();
}