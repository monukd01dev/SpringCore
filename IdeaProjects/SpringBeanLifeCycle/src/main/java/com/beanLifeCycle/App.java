package com.beanLifeCycle;


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
        System.out.println( "container get started then bean instantiate" );
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Person person = (Person) context.getBean("person");
        System.out.println("3rd step dependency get injected on request");
        System.out.println("4th destroy method we see in the LifeCycle through XML package");
    }
}
