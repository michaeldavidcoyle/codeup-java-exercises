package util;

import java.util.ArrayList;

public class MathHelpers {
    private static Input input = new Input();

    public static ArrayList<Integer> primeFactors(int integer) {
        ArrayList<Integer> factors = new ArrayList<>();

        final double SQRT = Math.sqrt((double) integer);

        while (integer % 2 == 0) {
            factors.add(2);
            integer /= 2;
        }

        for (int i = 3; i <= integer; i += 2) {
            while (integer % i == 0) {
                factors.add(i);
                integer /= i;
            }

            if (i >= SQRT && factors.size() == 0) break;
        }

        return factors;
    }

    public static void main(String[] args) {
        int integer = input.getInt("Enter an integer to factorize: ");

        ArrayList<Integer> factors = primeFactors(integer);

        System.out.printf("The prime factors of %d: %s", integer, factors.toString());
    }
}
