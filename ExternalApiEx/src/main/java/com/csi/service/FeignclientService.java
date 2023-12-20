package com.csi.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "app", url="https://jsonmock.hackerrank.com/api/countries?name=India")
public interface FeignclientService {
    @GetMapping
    public String env();
}
