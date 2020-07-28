package com.chenqingjie.demo.springconsumer.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {

  @Autowired
  RestTemplate restTemplate;

  @HystrixCommand(fallbackMethod = "queryByIdError")
  public String queryById(Long id) {
    return restTemplate.getForObject("http://demo-spring-provider/provider/" + id, String.class);
  }

  public String queryByIdError(Long id) {
    return "call provider: " + id + ", error!";
  }
}
