package com.beanLifeCycle.byannotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cart {
    private String costumer_name;
    private int cart_value;

    public Cart() {
        super();

    }

    public Cart(String costumer_name, int cart_value) {
        System.out.println("Constructor Running");
        this.costumer_name = costumer_name;
        this.cart_value = cart_value;
    }

    public String getCostumer_name() {
        return costumer_name;
    }

    public int getCart_value() {
        return cart_value;
    }
    @PostConstruct
    public void born() {
        System.out.println("Init invoked");
    }
    @PreDestroy
    public void dead() {
        System.out.println("Destroy Invoked");
    }

    @Override
    public String toString() {
        return "Cart{" +
                "costumer_name='" + costumer_name + '\'' +
                ", cart_value=" + cart_value +
                '}';
    }
}
