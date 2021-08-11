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
            "view movies in the scifi category",
            "add movie"
    };

    public static void displayMenu() {
        for (int i = 0; i < menu.length; i++) {
            System.out.printf("%d - %s%n", i, menu[i]);
        }
    }

    public static String formatMovie(Movie movie) {
        return String.format("%s -- %s", movie.getName(), movie.getCategory());
    }

    public static void displayMovies() {
        Movie[] movies = MoviesArray.findAll();

        for (Movie movie : movies) {
            System.out.println(formatMovie(movie));
        }
    }

    public static void displayMovies(String category) {
        Movie[] movies = MoviesArray.findAll();

        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.println(formatMovie(movie));
            }
        }
    }

    public static void addUserMovie() {
        Input input = new Input();

        System.out.print("Enter title: ");
        String userTitle = input.getSentence();

        System.out.print("Enter category: ");
        String userCategory = input.getString();

        MoviesArray.addMovie(new Movie(userTitle, userCategory));
    }

    public static void main(String[] args) {
        Input input = new Input();

        boolean userWantsToContinue = true;

        do {
            System.out.println("What would you like to do?");

            displayMenu();

            System.out.print("Enter your choice: ");
            int userOption = input.getInt(0, menu.length - 1);

            switch (userOption) {
                case 0:
                    System.out.println("Goodbye!");
                    userWantsToContinue = false;
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
                case 7:
                    addUserMovie();
                    break;
            }
        } while (userWantsToContinue);
    }
}
