package com.darkh0le.factory;

import com.darkh0le.store.PizzaStore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChickenBurger extends Pizza {

    private List<String> strings = new ArrayList<>(List.of("Pan", "Pollo", "Queso"));
    private Map<Integer, String> toppings = new HashMap<>();

    public ChickenBurger() {
        System.out.println("Preparando hamburgesa de Pollos");
        toppings.put(1, "Pan");
        toppings.put(2, "Carne");
        toppings.put(3, "Queso");
        toppings.put(4, "Lechuga");
        toppings.put(5, "Tomate");
        toppings.put(6, "Pepinillos");
        toppings.put(7, "Pan");

        price = 10.99F;
        name = "Hamburguesa de Pollo";
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
        return "ChickenBurger{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", toppings=" + toppings +
                '}';
    }

}
