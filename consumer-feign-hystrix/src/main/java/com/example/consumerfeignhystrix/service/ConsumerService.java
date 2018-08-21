package com.example.consumerfeignhystrix.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 从compute-service的控制台中，可以看到服务提供方输出了原本要返回的结果，
 * 但是由于返回前延迟了5秒，而服务消费方触发了服务请求超时异常，
 * 服务消费者就通过HystrixCommand注解中指定的降级逻辑进行执行，因此该请求的结果返回了fallback
 */

@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallback")
    public String consumer() {
        return restTemplate.getForObject("http://compute-service/dc", String.class);
    }

    public String fallback() {
        return "fallback";
    }

}
