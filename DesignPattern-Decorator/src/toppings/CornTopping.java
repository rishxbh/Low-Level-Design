package toppings;

import pizza.Pizza;

public class CornTopping extends Topping{
    Pizza pizza;
    public CornTopping(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return this.pizza.getCost() + 20;
    }
}
