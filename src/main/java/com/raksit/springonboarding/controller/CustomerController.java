package com.raksit.springonboarding.controller;

import com.raksit.springonboarding.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @Autowired
  private CustomerService customerService;

  @GetMapping("/{customerId}")
  public String findById(@PathVariable Long customerId) {
    return customerService.findById(customerId);
  }
}
