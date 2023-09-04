package com.beanLifeCycle.byxml;

public class Student {
    private int id;
    private String name;

    public Student() {
        super();
    }

    public Student(int id, String name) {
        System.out.println("arg-conts running");
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
// my methods working without writing throws Exception but did it for best practices
    public void vishnu() throws Exception{
        System.out.println("Aarambha");
    }

    public void shiva() throws Exception {
        System.out.println("Anta");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
