package com.spring.core.di.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 02-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("ci/constructor.xml");
        Department department = (Department) context.getBean("department");
        Department cyberdept = (Department) context.getBean("cyberdept");
        System.out.println(department);
        System.out.println(cyberdept);

        int index = 0;

        for (Student s : department.getStudentList()) {
            System.out.println("---------------------------------------");
            System.out.println("Student Name : "+ s.getStu_name());
            System.out.println("Student Age  : "+ s.getAge());
            System.out.println("Department   : "+ department.getDep_name());
            System.out.println("---------------------------------------\n");
            index++;
        }
        System.out.println("Total No Of Student In "+department.getDep_name()+" is : "+index+"\n");
        System.out.println("-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-x-");
        int index1 = 0;

        for (Student s : cyberdept.getStudentList()) {
            System.out.println("---------------------------------------");
            System.out.println("Student Name : "+ s.getStu_name());
            System.out.println("Student Age  : "+ s.getAge());
            System.out.println("Department   : "+ cyberdept.getDep_name());
            System.out.println("---------------------------------------\n");
            index1++;
        }
        System.out.println("Total No Of Student In "+cyberdept.getDep_name()+" is : "+index1+"\n");
    }
}
