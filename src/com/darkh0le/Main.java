package com.darkh0le;

import com.darkh0le.factory.ChickenBurger;
import  com.darkh0le.store.PizzaStore;
public class Main {
    public static void main(String[] args) {

        PizzaStore store = new PizzaStore();
        store.orderPizza("Chees");
        store.orderPizza("Chicken");

    }
}
