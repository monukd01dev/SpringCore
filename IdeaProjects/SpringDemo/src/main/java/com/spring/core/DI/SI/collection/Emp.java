package com.spring.core.di.si.collection;
import java.util.*;
/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 01-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Emp {
    private String name ;
    private List<String> number;
    private Set<String> address;
    private Map<String,String> courses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumber() {
        return number;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }

    public Set<String> getAddress() {
        return address;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public Emp() {
        super();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
