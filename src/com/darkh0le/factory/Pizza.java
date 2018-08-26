package com.darkh0le.factory;

import java.util.List;

public abstract class Pizza {

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
