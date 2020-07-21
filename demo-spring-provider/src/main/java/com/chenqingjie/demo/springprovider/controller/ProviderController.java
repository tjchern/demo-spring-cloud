package com.chenqingjie.demo.springprovider.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("provider")
public class ProviderController {

  @GetMapping("/{id}")
  public String queryById(@PathVariable("id") Long id) {
    logger.info("id: {}", id);
    return "user id: " + id;
  }
}