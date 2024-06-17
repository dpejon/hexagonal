package com.pejon.hexagonal.adapters.out.client;

import com.pejon.hexagonal.adapters.out.client.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "FindAddressByZipCodeClient",
        url = "${pejon.client.address.url}"
)
public interface FindAddressByZipCodeClient {

    //essa anotacao nao expoe um endpoint, ela esta mapeando uma chamada get para uma api externa
    @GetMapping("/{zipCode}")
    AddressResponse find(@PathVariable("zipCode") String zipCode);
}
