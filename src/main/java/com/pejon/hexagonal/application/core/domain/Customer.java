package com.pejon.hexagonal.application.core.domain;

public class Customer {
    public Customer(String id, String name, Address address, Boolean isValidCpf) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.isValidCpf = isValidCpf;
    }

    public Customer() {
        this.isValidCpf = false;
    }

    private String id;
    private String name;
    private Address address;
    private Boolean isValidCpf;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Boolean getValidCpf() {
        return isValidCpf;
    }

    public void setValidCpf(Boolean validCpf) {
        isValidCpf = validCpf;
    }
}
