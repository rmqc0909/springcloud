package com.example.compute1.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class ComputeController {
    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @GetMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        String services = "Services: " + client.getServices();
        Integer r = a + b;
        logger.info("/add, services:" + services + ", result:" + r);
        return r;
    }

    @GetMapping("/dc")
    public String dc() {
        String services = "/dc, Services: " + client.getServices();
        logger.info(services);
        return services;
    }
}
