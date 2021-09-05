package util;

import java.math.BigInteger;
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

    public static boolean isPrime(int integer) {
        if (integer <= 1) return false;
        if (integer == 2) return true;
        if (integer % 2 == 0) return false;

        final double SQRT = Math.sqrt((double) integer);

        for (int i = 3; i <= SQRT; i += 2) {
            if (integer % i == 0) return false;
        }

        return true;
    }

    public static int greatestCommonFactor(int firstInteger, int secondInteger) {
        int greater = Math.max(firstInteger, secondInteger);
        int lesser = Math.min(firstInteger, secondInteger);

        for (int i = lesser; i > 1; i--) {
            if (greater % i == 0 && lesser % i == 0) {
                return i;
            }
        }

        return 1;
    }

//    public static long factorial(int integer) {
//        long product = 1L;
//
//        for (int i = integer; i > 1; i--) {
//            product *= i;
//        }
//
//        return product;
//    }

    public static BigInteger factorial(int integer) {
        BigInteger product = new BigInteger("1");

        for (int i = integer; i > 1; i--) {
            product = product.multiply(BigInteger.valueOf(i));
        }

        return product;
    }

    public static ArrayList<Integer> factorize(int integer) {
        ArrayList<Integer> factors = new ArrayList<>();
        final double SQRT = Math.sqrt((double) integer);

        for (int i = 2; i < SQRT; i++) {
            if (integer % i == 0) factors.add(i);
        }

        int last = factors.size() - 1;
        int intSqrt = (int) SQRT;

        if (intSqrt == SQRT) factors.add(intSqrt);

        for (int i = last; i >= 0; i--) {
            factors.add(integer / factors.get(i));
        }

        return factors;
    }

    public static int sumDigits(long n) {
        String nString = String.valueOf(n);

        int sum = 0;

        for (int i = 0; i < nString.length(); i++) {
            sum += Integer.parseInt(String.valueOf(nString.charAt(i)));
        }

        return sum;
    }

    public static double percentError(double observed, double expected) {
        return (Math.abs(observed - expected) / expected) * 100;
    }

    public static double logBaseN(double base, double operand) {
        return Math.log(operand) / Math.log(base);
    }

    public static void main(String[] args) {
//        int integer = input.getInt("Enter an integer to factorize: ");
//
//        ArrayList<Integer> factors = primeFactors(integer);
//
//        System.out.printf("The prime factors of %d: %s", integer, factors.toString());

//        int primeCandidate = input.getInt("Enter integer to test if prime: ");
//
//        if (isPrime(primeCandidate)) {
//            System.out.printf("%d is prime.", primeCandidate);
//        } else {
//            ArrayList<Integer> factors = primeFactors(primeCandidate);
//            System.out.printf("%d is composite. Its prime factors are %s", primeCandidate, factors.toString());
//        }

//        int firstInteger = input.getInt("Enter first integer: ");
//        int secondInteger = input.getInt("Enter second integer: ");
//
//        int gcf = greatestCommonFactor(firstInteger, secondInteger);
//
//        System.out.printf("Greatest common factor of %d and %d is %d", firstInteger, secondInteger, gcf);

//        int integer = input.getInt("Enter an integer from 1 to 20: ", 1, 20);
//        long integerFactorial = factorial(integer);
//
//        System.out.printf("%d! = %d", integer, integerFactorial);

//        int integer = input.getInt("Enter an integer: ");
//        ArrayList<Integer> factors = factorize(integer);
//
//        System.out.printf("Factors of %d are: %s", integer, factors.toString());

//        int integer = input.getInt("Enter an integer: ");
//        BigInteger integerFactorial = factorial(integer);
//
//        System.out.printf("%d! = %d", integer, integerFactorial);

//        long testInteger = 1110010001100110101L;
//        int sum = sumDigits(testInteger);
//        System.out.printf("Sum of the digits of %d is %d.", testInteger, sum);

//        double observed = input.getDouble("Enter observed value: ");
//        double expected = input.getDouble("Enter expected value: ");
//
//        double percentErr = percentError(observed, expected);
//
//        System.out.printf("Percent Error: %f%%", percentErr);

        double base = input.getDouble("Enter log base: ");
        double operand = input.getDouble("Enter log operand: ");
        double log = logBaseN(base, operand);

        System.out.printf("log base %.0f of %.0f = %f", base, operand, log);
    }
}
