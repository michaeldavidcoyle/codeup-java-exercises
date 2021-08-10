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

    public static void displayMovies() {
        Movie[] movies = MoviesArray.findAll();

        for (Movie movie : movies) {
            System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
        }
    }

    public static void displayMovies(String category) {
        Movie[] movies = MoviesArray.findAll();

        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.printf("%s -- %s%n", movie.getName(), movie.getCategory());
            }
        }
    }

    public static void main(String[] args) {
        Input input = new Input();

        System.out.println("What would you like to do?");

        displayMenu();

        System.out.print("Enter your choice: ");
        int userOption = input.getInt(0, 6);

        switch (userOption) {
            case 0:
                System.out.println("Goodbye!");
                break;
            case 1:
                displayMovies();
                break;
            case 2:
                displayMovies("animated");
                break;
            case 3:
                displayMovies("drama");
                break;
            case 4:
                displayMovies("horror");
                break;
            case 5:
                displayMovies("musical");
                break;
            case 6:
                displayMovies("scifi");
                break;
        }
    }
}
