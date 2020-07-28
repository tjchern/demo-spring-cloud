package com.chenqingjie.demo.springzuul.controller;

import com.chenqingjie.demo.springzuul.service.ZuulService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
// @RestController
@RequestMapping("consumer")
public class ZuulController1 {

  @Autowired
  ZuulService zuulService;
  // @GetMapping("/{id}")
  // public String queryById(@PathVariable("id") Long id) {
  @GetMapping("/x")
  public String queryById() {
    return this.zuulService.queryById(1L);
  }
}
