package com.beanLifeCycle.byxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//        Implementation of Life Cycle of Bean by XML
        ApplicationContext context = new ClassPathXmlApplicationContext("ByXML/config.xml");

        Student student = (Student) context.getBean("student");
        System.out.println(student);
//        ((ConfigurableApplicationContext)context).close();// we have one more method
        ((AbstractApplicationContext)context).registerShutdownHook();// try both
//        and for both methods we can use try with resources to auto close resources
    }
}
