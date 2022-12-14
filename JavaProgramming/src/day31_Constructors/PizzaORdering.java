package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaORdering {

    public static void main(String[] args) {
        // create 100 pizza objects: size - 'S',  cheese topping-2, pepperoni topping -3
        // create 100 Pizza Objects: size - 'M', cheese topping-3,  pepperoni topping -4
        //create 100 Pizza Objects: size - 'L', cheese topping-4,  pepperoni topping -5

        ArrayList<Pizza> pizzas = null;
        for (int i = 0; i < 100; i++) {
            pizzas = new ArrayList<>();

            Pizza small = new Pizza('S', 2, 3);
            Pizza mediumPizza = new Pizza('M', 3, 4);
            Pizza largePizza = new Pizza('L', 4, 5);

            pizzas.addAll(Arrays.asList(small, mediumPizza, largePizza));

        }

        System.out.println("Total number of Pizza: " + pizzas.size());
        double totalPrize = 0;

        for (Pizza pizza : pizzas) {
            totalPrize += pizza.calxCost();

        }
        System.out.println("totalPrice = " + totalPrize);

    }


}
