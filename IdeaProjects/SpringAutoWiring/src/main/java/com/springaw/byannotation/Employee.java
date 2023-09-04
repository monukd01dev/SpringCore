package com.springaw.byannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringAutoWiring
    Date    : 04-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Employee {

    @Autowired
//    @Qualifier("address1")
    private Address address;

    public Employee() {
        super();
    }
//    @Autowired
//    @Qualifier("address1") qualifier not work on constructor
    public Employee(Address address) {
        this.address = address;
    }

//    @Autowired
//    @Qualifier("address1")
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
