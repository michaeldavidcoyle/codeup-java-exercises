package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.next();
    }

    public String getSentence() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return getString().toLowerCase().contains("y");
    }

    public int getInt(int min, int max) {
        String userInput = this.getString();
        int userInt = 0;

        try {
            userInt = Integer.parseInt(userInput);
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" is not an integer.%n", userInput);
        }

        if (userInt < min || userInt > max) {
            System.out.println("Sorry, that's not within the range.");
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public int getInt() {
        String userInput = this.getString();
        int userInt = 0;

        try {
            userInt = Integer.valueOf(userInput); // IntelliJ suggests using parseInt
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" is not an integer.%n", userInput);
        }

        return userInt;
    }

    public double getDouble(double min, double max) {
        double userDouble = this.getDouble();

        if (userDouble < min || userDouble > max) {
            System.out.println("Sorry, that's not within the range.");
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }

    public double getDouble() {
        return this.scanner.nextDouble();
    }
}
