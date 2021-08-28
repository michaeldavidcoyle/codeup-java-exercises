package pizza;

import java.util.ArrayList;
import util.Input;

public class PizzaShop {

    private static ArrayList<Pizza> pizzas = new ArrayList<>();
    private static final String[] crusts = {"thin", "hand-tossed", "pan"};
    private static final String[] sizes = {"small", "medium", "large", "extra large"};
    private static final String[] meats = {
            "pepperoni", "italian sausage", "canadian bacon", "bacon", "ground beef", "anchovies"
    };
    private static final String[] veggies = {
            "mushrooms", "black olives", "bell peppers", "onions", "tomatoes", "jalepeños"
    };
    private static final Input input = new Input();

    public static String selectCrust() {
        System.out.println("\nCrust options: ");

        for (int i = 0; i < crusts.length; i++) {
            System.out.printf("%d - %s%n", i + 1, crusts[i]);
        }

        int crustOption = input.getInt("Please choose a crust: ", 1, crusts.length);

        return crusts[ crustOption - 1 ];
    }

    public static String selectSize() {
        System.out.println("\nSize options: ");

        for (int i = 0; i < sizes.length; i++) {
            System.out.printf("%d - %s%n", i + 1, sizes[i]);
        }

        int sizeOption = input.getInt("Please choose a size: ", 1, sizes.length);

        return sizes[ sizeOption - 1 ];
    }

    public static ArrayList<String> selectVeggies() {
        ArrayList<String> veggieChoices = new ArrayList<>();

        boolean moreVeggies;

        do {
            System.out.println("\nVeggies options: ");

            for (int i = 0; i < veggies.length; i++) {
                System.out.printf("%d - %s%n", i + 1, veggies[i]);
            }

            int veggieOption = input.getInt("Please choose a veggie: ", 1, veggies.length);

            veggieChoices.add(veggies[veggieOption - 1]);

            moreVeggies = input.yesNo("Add another veggie? [y/n] ");
        } while(moreVeggies);

        return veggieChoices;
    }

    public static ArrayList<String> selectMeats() {
        ArrayList<String> meatChoices = new ArrayList<>();

        boolean moreMeats;

        do {
            System.out.println("\nMeats options: ");

            for (int i = 0; i < meats.length; i++) {
                System.out.printf("%d - %s%n", i + 1, meats[i]);
            }

            int meatOption = input.getInt("Please choose a meat: ", 1, meats.length);

            meatChoices.add(meats[meatOption - 1]);

            moreMeats = input.yesNo("Add another meat? [y/n] ");
        } while(moreMeats);

        return meatChoices;
    }

    public static String[] selectToppings() {
        ArrayList<String> allChoices = new ArrayList<>();

        boolean addVeggies = input.yesNo("\nAdd veggies? [y/n] ");

        if (addVeggies) {
            allChoices.addAll(selectVeggies());
        }

        boolean addMeats = input.yesNo("\nAdd meats? [y/n] ");

        if (addMeats) {
            allChoices.addAll(selectMeats());
        }

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

        pizzas.add(pizza);
    }

    public static void printPizzas() {
        String size;
        String crust;
        String toppings;

        System.out.println("\nYour order: ");
        for (Pizza pizza : pizzas) {
            size = pizza.getSize();
            crust = pizza.getCrust();
            toppings = String.join(", ", pizza.getToppings());

            System.out.printf("One %s %s pizza with %s.%n", size, crust, toppings);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to our Pizza Shop!");
        boolean morePizza;

        do {
            orderPizza();

            morePizza = input.yesNo("Would you like another pizza? [y/n] ");
        } while (morePizza);

        printPizzas();
    }
}
