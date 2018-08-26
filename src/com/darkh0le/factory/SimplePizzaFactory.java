package com.darkh0le.factory;

//Add what varies and separete of what not.

/**
 * In this case if we want to add new pizza we need to  chage code, and that broke what of one OO Design priciples
 * Code should be close for change but open for extension
 *
 *         switch (pizzaType){
 *             case "Chees":
 *                 Pizza chees = new CheesBurger();
 *                 return chees.toString();
 *             case "Chicken":
 *                 Pizza chicken = new ChickenBurger();
 *                 return chicken.toString();
 * (New Pizza) case "new Pizza":
 *                  Piezza new pizza = new Pizza();
 *             default:
 *                 break;
 *         }
 */
//Program to an inteface

    //To handle we encapsule(separete) what change, so we create a new factory that will handle the proces of create pizza
    //With this implementation we separete what chance, but we face the same problem, with any new hamburger we must change the factoy class,
    //to be able the procces of making a new pizza.

public class SimplePizzaFactory {

    public String makePizza(String pizzaType){

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
