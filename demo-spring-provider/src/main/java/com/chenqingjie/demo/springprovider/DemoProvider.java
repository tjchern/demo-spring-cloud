package com.chenqingjie.demo.springprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication(scanBasePackages = {"com.chenqingjie.demo.springprovider"})
// @ServletComponentScan
public class DemoProvider {

  public static void main(String[] args) {
    SpringApplication.run(DemoProvider.class, args);
  }

}
