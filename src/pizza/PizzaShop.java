package pizza;

import java.util.ArrayList;
import util.Input;

public class PizzaShop {

    private static ArrayList<Pizza> pizzas;
    private static String[] crusts = {"thin", "hand-tossed", "pan"};
    private static String[] sizes = {"small", "medium", "large", "extra large"};
    private static String[] meats = {
            "pepperoni", "italian sausage", "canadian bacon", "bacon", "ground beef", "anchovies"
    };
    private static String[] veggies = {
            "mushrooms", "black olives", "bell peppers", "onions", "tomatoes", "jalepeños"
    };
    private static Input input = new Input();

    public static String chooseCrust() {
        System.out.println("Crust options: ");

        for (int i = 0; i < crusts.length; i++) {
            System.out.printf("%d - %s", i + 1, crusts[i]);
        }

        int crustOption = input.getInt("Please choose a crust: ", 1, crusts.length);

        return crusts[ crustOption - 1 ];
    }
}
