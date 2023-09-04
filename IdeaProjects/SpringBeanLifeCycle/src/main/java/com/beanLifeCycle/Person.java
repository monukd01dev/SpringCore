package com.beanLifeCycle;

public class Person {
    private String name;

    public Person() {
        super();
    }

    public Person(String name) {
        System.out.println("2nd step doing instance created through config details");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
