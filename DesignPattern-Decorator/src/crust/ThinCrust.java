package crust;

import pizza.Pizza;

public class ThinCrust extends Crust{
    Pizza pizza;
    public ThinCrust(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return pizza.getCost() + 80;
    }
}
