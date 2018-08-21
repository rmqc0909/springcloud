package com.example.compute1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class Compute1Application {

    public static void main(String[] args) {
        SpringApplication.run(Compute1Application.class, args);
    }
}
