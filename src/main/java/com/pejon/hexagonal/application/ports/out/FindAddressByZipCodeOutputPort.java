package com.pejon.hexagonal.application.ports.out;

import com.pejon.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
