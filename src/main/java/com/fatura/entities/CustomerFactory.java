package com.fatura.entities;

import com.fatura.database.CustomerDatabase;

import java.time.ZonedDateTime;
import java.util.ArrayList;

public class CustomerFactory {
    public  static Customer newCustomer(String name){
        return new Customer(name, ZonedDateTime.now(), new ArrayList<>());
    }
}
