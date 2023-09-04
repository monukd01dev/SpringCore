package com.springaw.byxml;

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
    private Address address;

    public Employee() {
        super();
    }

    public Employee(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}
