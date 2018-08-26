package com.darkh0le.store;

import com.darkh0le.factory.CheesBurger;
import com.darkh0le.factory.ChickenBurger;
import com.darkh0le.factory.Pizza;

public class PizzaStore {

    public String orderPizza(String pizzaType){

        switch (pizzaType){
            case "Chees":
                Pizza chees = new CheesBurger();
                return chees.toString();
            case "Chicken":
                Pizza chicken = new ChickenBurger();
                return chicken.toString();
            default:
                break;
        }

        return "0";
    }
}
