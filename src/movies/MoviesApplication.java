package movies;

import util.Input;

public class MoviesApplication {

    private static String[] menu = {
           "exit",
            "view all movies",
            "view movies in the animated category",
            "view movies in the drama category",
            "view movies in the horror category",
            "view movies in the musical category",
            "view movies in the scifi category"
    };

    public static void displayMenu() {
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d - %s%n", i, menu[i]);
        }
    }

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?");

        displayMenu();

        System.out.print("Enter your choice: ");
        int userOption = input.getInt(0, 6);

        System.out.printf("You chose %d%n", userOption);
    }
}
