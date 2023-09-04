package com.springaw.byannotation;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringAutoWiring
    Date    : 04-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Address {
    private String country;
    private String state;

    public Address() {
        super();
    }

    public Address(String country, String state) {
        this.country = country;
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
