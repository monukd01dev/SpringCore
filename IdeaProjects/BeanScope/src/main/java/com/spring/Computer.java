package com.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
    Name    : Monu KD (monukd01dev)
    Project : BeanScope
    Date    : 05-Sep-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
@Component
//@Scope("singleton")//which is also default one
@Scope("prototype")
public class Computer {
    @Value("I9 900K")
    private String cpu;
    @Value("32GB")
    private String ram;

    static Computer getComputer(String cpu, String ram) {
        return new Computer(cpu,ram);
    }
    public Computer() {
        super();
    }


    public Computer(String cpu, String ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                '}';
    }
}
