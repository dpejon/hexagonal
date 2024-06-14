package com.pejon.hexagonal.application.ports.out;

import com.pejon.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
