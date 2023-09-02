package com.spring.core.di.ci.consPriority;

/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 02-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class PriorityChecker {
    private int a;
    private int b;

    public PriorityChecker() {
        super();
    }
//  after constructor with string as parameter is comment out now order of constructors play big roll
//  First catch first used (bottom to top)
//  Last is first
    public PriorityChecker(float a, float b) {
        super();
        System.out.println("Float");
    }
    public PriorityChecker(double a, double b) {
        super();
        System.out.println("Double");
    }
    public PriorityChecker(int a, int b) {
        super();
        this.a = a;
        this.b = b;
        System.out.println("I am the One");
    }
//    String has the highest priority
//    public PriorityChecker(String a ,String b) {
//        super();
//        System.out.println("String");
//    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "PriorityChecker{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
