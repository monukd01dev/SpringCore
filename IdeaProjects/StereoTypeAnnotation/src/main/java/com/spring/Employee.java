package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

/*
    Name    : Monu KD (monukd01dev)
    Project : StereoTypeAnnotation
    Date    : 04-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Component
public class Employee {
    @Value("Monu KD")
    private String emp_name;
    @Value("#{address}")
    private List<String> address;

    public String getEmp_name() {
        return emp_name;
    }

    public List<String> getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_name='" + emp_name + '\'' +
                ", address=" + address +
                '}';
    }
}
