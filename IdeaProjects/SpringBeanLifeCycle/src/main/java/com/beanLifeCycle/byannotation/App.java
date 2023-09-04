package com.beanLifeCycle.byannotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
//            Bean Life Cycle by Annotation
//            Only Required one dependency javax.annotation-api version 1.3.2
        try (
                ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("ByAnnotation/config.xml")
                ) {

            Cart cart = (Cart) context.getBean("cart");
            System.out.println(cart);

        }
    }
}
