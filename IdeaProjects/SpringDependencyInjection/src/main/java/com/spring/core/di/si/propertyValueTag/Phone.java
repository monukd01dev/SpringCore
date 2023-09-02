package com.spring.core.DI.SI.propertyValueTag;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 28-Aug-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Phone {
    private String brand;
    private String ram;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand=" + brand +
                ", ram=" + ram +
                '}';
    }

}















