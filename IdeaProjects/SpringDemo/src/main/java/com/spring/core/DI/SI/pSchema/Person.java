package com.spring.core.DI.SI.pSchema;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 28-Aug-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Person {
    private String name;
    private float Height;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float height) {
        Height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Height=" + Height +
                '}';
    }
}
