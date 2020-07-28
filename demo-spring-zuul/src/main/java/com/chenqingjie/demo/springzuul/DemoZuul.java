package com.chenqingjie.demo.springzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = {"com.chenqingjie.demo.springzuul"})
@EnableDiscoveryClient
@EnableZuulProxy
public class DemoZuul {

  public static void main(String[] args) {
    SpringApplication.run(DemoZuul.class, args);
  }

  // @Bean
  // @LoadBalanced
  // RestTemplate restTemplate() {
  //   return new RestTemplate();
  // }
}
