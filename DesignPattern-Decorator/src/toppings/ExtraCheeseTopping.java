package toppings;

import pizza.Pizza;

public class ExtraCheeseTopping extends Topping{
    Pizza pizza;
    public ExtraCheeseTopping(Pizza pizza) {
        this.pizza = pizza;
    }
    @Override
    public int getCost() {
        return this.pizza.getCost() + 40;
    }
}
