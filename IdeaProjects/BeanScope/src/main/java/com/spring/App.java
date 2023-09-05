package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        IN spring core there are two bean scopes
//        1. Singleton -> only create one instance, only give same instance on injection requests
//        2. Prototype -> for every request give new instance
//        request, session, and globalsession are related to SpringMVC

        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Computer computer = context.getBean("computer", Computer.class);
        Computer computer1 = context.getBean("computer", Computer.class);
        System.out.println(computer.hashCode());
        System.out.println(computer.hashCode() == computer1.hashCode());
        Computer computer2 = Computer.getComputer("I7 5900k","64GB"); //static factory method that I have created

        System.out.println(computer+"\n"+computer1+"\n"+computer2);

    }
}
