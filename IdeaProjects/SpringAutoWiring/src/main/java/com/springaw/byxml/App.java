package com.springaw.byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringAutoWiring
    Date    : 04-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class App {

    public static void main(String[] args) {
//        Implementing auto-wiring by XML
        ApplicationContext context = new ClassPathXmlApplicationContext("ByXml/config.xml");
        Employee emp = context.getBean("emp", Employee.class);
        System.out.println(emp);
    }
}
