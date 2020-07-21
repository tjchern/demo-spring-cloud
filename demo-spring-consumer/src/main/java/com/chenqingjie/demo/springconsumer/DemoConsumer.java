package com.chenqingjie.demo.springconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication(scanBasePackages = {"com.chenqingjie.demo.springconsumer"})
@EnableDiscoveryClient
public class DemoConsumer {

  public static void main(String[] args) {
    SpringApplication.run(DemoConsumer.class, args);
  }

}
