package com.spring.core.di.si.reference;

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
        System.out.println("SI : Reference");
        ApplicationContext context = new ClassPathXmlApplicationContext("si/reference.xml");

        A a1 = (A) context.getBean("a1");
        System.out.println(a1);
        System.out.println("Name : "+a1.getName()+"\nUsername : "+a1.getB().getUsername() );

    }
}
