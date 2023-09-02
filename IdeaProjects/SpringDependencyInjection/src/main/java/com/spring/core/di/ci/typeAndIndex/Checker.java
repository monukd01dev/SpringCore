package com.spring.core.di.ci.typeAndIndex;

import java.sql.SQLOutput;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 02-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Checker {
    private int a;
    private int b;

    public Checker(String a, String b) {
        System.out.println("String running");

        System.out.println("a = "+this.a+" and b = "+this.b);
    }

    public Checker(double a, double b) {
        System.out.println("double is running");
        System.out.println("a = "+this.a+" and b = "+this.b);
    }
    public Checker(int a, int b) {
        System.out.println("int is running");
        this.a =a;
        this.b = b;
        System.out.println("a = "+this.a+" and b = "+this.b);
    }
    public Checker(float a, float b) {
        System.out.println("float is running");
        System.out.println("a = "+this.a+" and b = "+this.b);
    }
    public Checker() {
        super();
        System.out.println("instantiated");
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "Checker{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
