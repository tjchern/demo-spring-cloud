package com.chenqingjie.demo.springconsumer.service.impl;

import com.chenqingjie.demo.springconsumer.service.ConsumerService;
import org.springframework.stereotype.Component;

@Component
public class ConsumerServiceImpl implements ConsumerService {

  @Override
  public String queryById(Long id) {
    return "feign hystrix error, id: " + id;
  }
}
