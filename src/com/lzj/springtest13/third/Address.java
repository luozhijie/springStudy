package com.lzj.springtest13.third;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addressBean")
public class Address {
    @Value("解放西路")
    private String street;
    @Value("330001")
    private int postcode;
    @Value("南昌")
    private String country;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFullAddress(String prefix) {
        return prefix + " : " + street + " " + postcode + " " + country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", postcode=" + postcode +
                ", country='" + country + '\'' +
                '}';
    }
}
