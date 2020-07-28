package com.chenqingjie.demo.springzuul.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class ZuulService {

  // @Autowired
  // private DiscoveryClient discoveryClient;

  // @Autowired
  // RestTemplate restTemplate;

  public String queryById(Long id) {

    logger.info("id: {}", id);
    return "here";
    // // ribbon parse the demo-spring-provider to ip:port, when use ribbon, need add @LoadBalanced
    // return restTemplate.getForObject("http://demo-spring-provider/provider/" + id, String.class);
    // List<ServiceInstance> serviceInstances = discoveryClient.getInstances("demo-spring-provider");
    // logger.info("serviceInstances: {}", serviceInstances);
    // return "user id: " + id;
  }
}
