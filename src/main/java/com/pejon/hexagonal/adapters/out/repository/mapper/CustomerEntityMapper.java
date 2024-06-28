package com.pejon.hexagonal.adapters.out.repository.mapper;

import com.pejon.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.pejon.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel =  "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);
}
