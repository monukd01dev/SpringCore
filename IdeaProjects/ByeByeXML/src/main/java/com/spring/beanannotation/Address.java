package com.spring.beanannotation;

import org.springframework.beans.factory.annotation.Value;

/*
    Name    : Monu KD (monukd01dev)
    Project : ByeByeXML
    Date    : 05-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Address {
    @Value("Moscow")
    private String state;

    @Value("Russia")
    private String country;

    public Address() {
        super();
    }

    public Address(String state, String country) {
        this.state = state;
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
