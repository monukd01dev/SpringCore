package com.spring.core.DI.SI.valueAsAttr;



/*
    Name    : Monu KD (monukd01dev)
    Project : SpringDemo
    Date    : 28-Aug-2023
    
    Connect
    Twitter  : https://twitter.com/monukd01dev
    LinkedIN : https://www.linkedin.com/in/monukd01dev/
    GitHub   : https://github.com/monukd01dev
     
*/
public class Pen {
    private String type;
    private String color;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
