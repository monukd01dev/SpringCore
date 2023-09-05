package com.spring.beanannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : ByeByeXML
    Date    : 05-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee);
        context.close();
    }


}
