package com.beanLifeCycle.byinterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

    private int emp_id;
    private String emp_name;

    public Employee() {
        super();
    }

    public Employee(int emp_id, String emp_name) {
        System.out.println("Constructor invoked");
        this.emp_id = emp_id;
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                '}';
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy");
    }
}
