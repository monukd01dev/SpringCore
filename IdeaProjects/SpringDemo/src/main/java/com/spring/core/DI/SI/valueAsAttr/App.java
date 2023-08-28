package com.spring.core.DI.SI.valueAsAttr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.SortedMap;

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
        System.out.println("SI : Value As Attribute");
        ApplicationContext context = new ClassPathXmlApplicationContext("valueAsAttr.xml");
        Pen pen = (Pen) context.getBean("pen");
        System.out.println(pen);
    }
}
