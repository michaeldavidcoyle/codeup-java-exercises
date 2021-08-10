package movies;

import util.Input;

public class MoviesApplication {
    private static String[] menu = {
           "exit",
            "view all movies",
            "view movies in the animated category",
            "view movies in the drama category",
            "view movies in the horror category",
            "view movies in the scifi category"
    };

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?");

        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d - %s%n", i, menu[i]);
        }

        System.out.print("Enter your choice: ");
        int userOption = input.getInt(0, 5);

        System.out.printf("You chose %d%n", userOption);
    }
}
