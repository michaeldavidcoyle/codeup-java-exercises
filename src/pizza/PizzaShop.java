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

    public static String selectCrust() {
        System.out.println("Crust options: ");

        for (int i = 0; i < crusts.length; i++) {
            System.out.printf("%d - %s", i + 1, crusts[i]);
        }

        int crustOption = input.getInt("Please choose a crust: ", 1, crusts.length);

        return crusts[ crustOption - 1 ];
    }

    public static String selectSize() {
        System.out.println("Size options: ");

        for (int i = 0; i < sizes.length; i++) {
            System.out.printf("%d - %s", i + 1, sizes[i]);
        }

        int sizeOption = input.getInt("Please choose a size: ", 1, sizes.length);

        return sizes[ sizeOption - 1 ];
    }

    public static ArrayList<String> selectVeggies() {
        ArrayList<String> veggieChoices = new ArrayList<>();

        boolean moreVeggies;

        do {
            System.out.println("Veggies options: ");

            for (int i = 0; i < veggies.length; i++) {
                System.out.printf("%d - %s", i + 1, veggies[i]);
            }

            int veggieOption = input.getInt("Please choose a veggie: ", 1, veggies.length);

            veggieChoices.add(veggies[veggieOption - 1]);

            moreVeggies = input.yesNo("Add another veggie? [y/n]");
        } while(moreVeggies);

        return veggieChoices;
    }

    public static ArrayList<String> selectMeats() {
        ArrayList<String> meatChoices = new ArrayList<>();

        boolean moreMeats;

        do {
            System.out.println("Meats options: ");

            for (int i = 0; i < meats.length; i++) {
                System.out.printf("%d - %s", i + 1, meats[i]);
            }

            int meatOption = input.getInt("Please choose a meat: ", 1, meats.length);

            meatChoices.add(meats[meatOption - 1]);

            moreMeats = input.yesNo("Add another meat? [y/n]");
        } while(moreMeats);

        return meatChoices;
    }

    public static String[] selectToppings() {
        ArrayList<String> allChoices = selectVeggies();
        ArrayList<String> meatChoices = selectMeats();

        allChoices.addAll(meatChoices);

        String[] toppingChoices = new String[allChoices.size()];

        for (int i = 0; i < toppingChoices.length; i++) {
            toppingChoices[i] = allChoices.get(i);
        }

        return toppingChoices;
    }

    public static void orderPizza() {
        String crust = selectCrust();
        String size = selectSize();
        String[] toppings = selectToppings();

        Pizza pizza = new Pizza(crust, size, toppings);
    }
}
