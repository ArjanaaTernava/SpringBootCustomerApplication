package com.intro.springbootapplication.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {


    public Customer getCustomer(){
        return new Customer(1L,"John");
    }
}
