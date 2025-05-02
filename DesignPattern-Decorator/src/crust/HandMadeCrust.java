package crust;

import pizza.Pizza;

public class HandMadeCrust extends Crust{
    Pizza pizza;
    public HandMadeCrust(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return this.pizza.getCost() + 80;
    }
}
