package com.beanLifeCycle.byinterface;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        Bean Life Cycle by Interfaces (InitializingBean, DisposableBean)

        try (
                ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ByInterface/config.xml")
        ) {
            Employee emp = (Employee) context.getBean("emp");
            System.out.println(emp);
        }

    }
}
