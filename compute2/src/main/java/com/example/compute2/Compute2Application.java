package com.example.compute2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringCloudApplication
public class Compute2Application {

    public static void main(String[] args) {
        SpringApplication.run(Compute2Application.class, args);
    }
}
