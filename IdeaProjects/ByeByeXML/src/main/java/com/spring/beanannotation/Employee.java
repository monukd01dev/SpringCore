package com.spring.beanannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/*
    Name    : Monu KD (monukd01dev)
    Project : ByeByeXML
    Date    : 05-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Employee {
    @Value("Monu KD")
    private String emp_name;

    @Autowired
    private Address address;

    public Employee() {
        super();
    }

    public Employee(String emp_name, Address address) {
        this.emp_name = emp_name;
        this.address = address;
    }
    public Employee(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @PostConstruct
    public void init() {
        System.out.println("init running");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy running");
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", address=" + address +
                '}';
    }
}
