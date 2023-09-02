package com.spring.core.di.si.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 01-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class App {
    public static void main(String[] args) {
        System.out.println("SI : Collection");
        ApplicationContext context = new ClassPathXmlApplicationContext("si/collection.xml");

        Emp emp = (Emp) context.getBean("emp");
        System.out.println(emp);

    }
}
