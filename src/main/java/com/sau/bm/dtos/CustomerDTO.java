package com.sau.bm.dtos;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class CustomerDTO {
    private long id;
    private String name;
    private String address;
    private String city;

    public long getId() {
        return id;
    }

    public CustomerDTO(long id, String name, String address, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    // Getters and setters
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() { return city; }

    public void setCity(String city) { this.city = city; }
}
