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

    public String getString(String prompt) {
        System.out.print(prompt);
        return this.scanner.next();
    }

    public String getSentence() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return getString().toLowerCase().contains("y");
    }

    public int getInt() {
        String userInput = this.getString();
        int userInt;

        try {
            userInt = Integer.valueOf(userInput); // IntelliJ suggests using parseInt
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" is not a valid integer. Please enter an integer: ", userInput);
            return getInt();
        }

        return userInt;
    }

    public int getInt(int min, int max) {
        int userInt = this.getInt();

        if (userInt < min || userInt > max) {
            System.out.print("Sorry, that's not within the range. Please try again: ");
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public double getDouble() {
        String userInput = this.getString();
        double userDouble;

        try {
            userDouble = Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.printf("\"%s\" is not valid. Please enter a decimal number: ", userInput);
            return getDouble();
        }

        return userDouble;
    }

    public double getDouble(double min, double max) {
        double userDouble = this.getDouble();

        if (userDouble < min || userDouble > max) {
            System.out.print("Sorry, that's not within the range. Please try again: ");
            return getDouble(min, max);
        } else {
            return userDouble;
        }
    }
}
