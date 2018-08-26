package com.darkh0le.factory;

import java.util.List;

public abstract class Pizza {

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public List<String> getToppings() {
        return toppings;
    }

    String name;
    //public BigDecimal prince;
    float price;
    List<String> toppings;

    void boxing(){
        System.out.println("Empacando en su caja, HAMBURGESA LISTA");
    };

    abstract void prepare();
    abstract void cook();
}
