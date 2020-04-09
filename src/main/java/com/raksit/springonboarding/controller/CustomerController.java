package com.raksit.springonboarding.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @GetMapping("/{customerId}")
  public String findById(@PathVariable Long customerId) {
    return "hello, " + customerId;
  }
}
