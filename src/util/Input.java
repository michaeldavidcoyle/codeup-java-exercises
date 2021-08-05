package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        return this.scanner.nextLine();
    }

    public boolean yesNo() {
        return getString().toLowerCase().contains("y");
    }

    public int getInt(int min, int max) {
        int userInt = this.getInt();

        if (userInt < min || userInt > max) {
            return getInt(min, max);
        } else {
            return userInt;
        }
    }

    public int getInt() {
        return this.scanner.nextInt();
    }


}
