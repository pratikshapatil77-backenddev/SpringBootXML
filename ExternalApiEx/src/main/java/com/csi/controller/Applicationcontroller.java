package com.csi.controller;

import com.csi.service.FeignclientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api")
@RestController
public class Applicationcontroller {
    @Autowired
    FeignclientService feignclientServiceImpl;
    @GetMapping("/envmsg")
public ResponseEntity<String> env(){
        return ResponseEntity.ok(feignclientServiceImpl.env());
    }
}
