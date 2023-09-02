package com.spring.core.di.ci;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 02-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Student {
    private String stu_name;
    private int age;

    public Student(String stu_name, int age) {
        super();
        this.stu_name = stu_name;
        this.age = age;
    }

    public Student() {
        super();
    }

    public String getStu_name() {
        return stu_name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_name='" + stu_name + '\'' +
                ", age=" + age +
                '}';
    }
}
