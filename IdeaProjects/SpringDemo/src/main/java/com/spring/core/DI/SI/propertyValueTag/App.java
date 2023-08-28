package com.spring.core.DI.SI.propertyValueTag;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 28-Aug-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class App {
    public static void main(String[] args) {
        System.out.println("SI : Property Value Tag");
        ApplicationContext context = new ClassPathXmlApplicationContext("propertyValueTag.xml");
        Phone phone = (Phone) context.getBean("phone");
        System.out.println(phone);

    }
}























