import crust.ThinCrust;
import pizza.FarmhousePizza;
import pizza.MargheritaPizza;
import pizza.Pizza;
import toppings.CornTopping;
import toppings.ExtraCheeseTopping;

public class Main {
    public static void main(String[] args) {
        Pizza pizza1 = new CornTopping(new ExtraCheeseTopping(new ThinCrust(new MargheritaPizza())));
        System.out.println(pizza1.getCost());
    }
}