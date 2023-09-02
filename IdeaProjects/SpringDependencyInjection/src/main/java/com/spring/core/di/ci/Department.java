package com.spring.core.di.ci;
import java.util.*;
/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 02-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Department {
    private String dep_name;
    private List<Student> studentList;

    public Department(String dep_name, List<Student> studentList) {
        this.dep_name = dep_name;
        this.studentList = studentList;
    }

    public Department() {
        super();
    }

//    Accessor Methods or Getters


    public String getDep_name() {
        return dep_name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dep_name='" + dep_name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
