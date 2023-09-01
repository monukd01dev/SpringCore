package com.spring.core.di.si.reference;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 01-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class B {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public B() {
        super();
    }

    @Override
    public String toString() {
        return "B{" +
                "username='" + username + '\'' +
                '}';
    }
}
