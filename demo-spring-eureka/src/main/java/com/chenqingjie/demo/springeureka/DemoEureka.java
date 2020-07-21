package com.chenqingjie.demo.springeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
// @ServletComponentScan
public class DemoEureka {

  public static void main(String[] args) {
    SpringApplication.run(DemoEureka.class, args);
  }

}
