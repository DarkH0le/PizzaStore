package com.darkh0le.factory;

import java.util.ArrayList;
import java.util.List;

public class CheesBurger extends Pizza{

    private List<String> strings = new ArrayList<>(List.of("Pan", "Carne", "Queso"));

    public CheesBurger() {
        System.out.println("Preparando hamburgesa con queso");
        price = 10.99F;
        name = "Hamburguesa con queso";
        prepare();
        cook();
        boxing();
    }

    @Override
    public void prepare() {
        super.toppings = strings;
    }

    @Override
    protected void cook() {
        System.out.println("Metiendo a la parrilla");
        System.out.println("Poninedo todo los ingredientes juntos");
    }

    @Override
    public String toString() {
        return "CheesHamburger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }
}
