package com.raksit.springonboarding.service;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  public String findById(Long customerId) {
    return "hello, " + customerId;
  }
}
