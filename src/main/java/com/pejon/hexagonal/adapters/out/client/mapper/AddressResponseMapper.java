package com.pejon.hexagonal.adapters.out.client.mapper;

import com.pejon.hexagonal.adapters.out.client.response.AddressResponse;
import com.pejon.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
