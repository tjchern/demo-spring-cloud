package com.chenqingjie.demo.springconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = {"com.chenqingjie.demo.springconsumer"})
// @ServletComponentScan
public class DemoConsumer {

  public static void main(String[] args) {
    SpringApplication.run(DemoConsumer.class, args);
  }

}
