package com.raksit.springonboarding.service;

import com.raksit.springonboarding.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public String findById(Long customerId) {
    return "hello, " + customerRepository.findById(customerId).get().getName();
  }
}
