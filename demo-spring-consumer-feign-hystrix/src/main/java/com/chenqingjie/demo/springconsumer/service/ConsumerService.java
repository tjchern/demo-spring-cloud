package com.chenqingjie.demo.springconsumer.service;

import com.chenqingjie.demo.springconsumer.service.impl.ConsumerServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "demo-spring-provider", fallback = ConsumerServiceImpl.class)
public interface ConsumerService {

  @GetMapping(value = "/provider/{id}")
  public String queryById(@RequestParam("id") Long id);
}
