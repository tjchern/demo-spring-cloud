package com.chenqingjie.demo.springconsumer.controller;

import com.chenqingjie.demo.springconsumer.service.ConsumerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("consumer")
public class ConsumerController {

  @Autowired
  private ConsumerService consumerService;

  @GetMapping("/{id}")
  public String queryById(@PathVariable("id") Long id) {
    return this.consumerService.queryById(id);
  }
}