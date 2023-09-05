package com.spring.beanannotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
    Name    : Monu KD (monukd01dev)
    Project : ByeByeXML
    Date    : 05-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Configuration
public class JavaConfig {
    @Bean("address")
    public Address getAddress() {
//        return new Address("Delhi", "India");
        return new Address();
    }
    @Bean("employee")
    public Employee getEmployee() {
        return new Employee("MonuKD");
    }
}
