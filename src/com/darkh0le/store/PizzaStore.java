package com.darkh0le.store;

import com.darkh0le.factory.CheesBurger;
import com.darkh0le.factory.ChickenBurger;
import com.darkh0le.factory.Pizza;
import com.darkh0le.factory.SimplePizzaFactory;

public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore() {
        this.factory = new SimplePizzaFactory();
    }

    public String orderPizza(String pizza) {
        return factory.makePizza(pizza);
    }
}
