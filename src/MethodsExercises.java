import java.util.Scanner;

public class MethodsExercises {
    /*
    * Create four separate methods. Each will perform an arithmetic operation:
    * Addition
    * Subtraction
    * Multiplication
    * Division
    * Each function needs to take two parameters/arguments so that the operation can be performed.
    * Test your methods and verify the output.
    * Add a modulus method that finds the modulus of two numbers.
    * Food for thought: What happens if we try to divide by zero? What should happen?
    */

    public static int add(int addendLeft, int addendRight) {
        return addendLeft + addendRight;
    }

    public static double add(double addendLeft, double addendRight) {
        return addendLeft + addendRight;
    }

    public static int subtract(int operandLeft, int operandRight) {
        return operandLeft - operandRight;
    }

    public static double subtract(double operandLeft, double operandRight) {
        return operandLeft - operandRight;
    }

    public static int multiply(int factor, int multiplier) {
        return factor * multiplier;
    }

    public static double multiply(double factor, double multiplier) {
        return factor * multiplier;
    }

    // Bonus: multiplication method without the * operator
//    public static int multiply(int factor, int multiplier) {
//        int product = 0;
//
//        for (int i = 0; i < multiplier ; i++) {
//            product += factor;
//        }
//
//        return product;
//    }

    // Bonus: recursive multiply
//    public static int multiply(int factor, int multiplier) {
//        if (multiplier == 1) return factor;
//
//        return factor + multiply(factor, multiplier - 1);
//    }

    public static double divide(double dividend, double divisor) {
        return dividend / divisor;
    }

    public static int modulus(int operand, int divisor) {
        return operand % divisor;
    }

    public static int getInteger(int min, int max) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between " + min + " and " + max + ": ");
        int userInt = input.nextInt();

        if (userInt < min || userInt > max) {
            return getInteger(min, max);
        }

        return userInt;
    }

    /*// looped version
    public static long factorial(long integer) {
        long product = 1;

        for (long i = integer; i > 1; i--) {
            product *= i;
        }

        return product;
    }*/

    // recursive version
    public static long factorial(long integer) {
        if (integer == 1) return 1;

        return integer * factorial(integer - 1);
    }

    public static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void rollDice() {
        System.out.println("Choose the number of side for your dice.");
        int sides = getInteger(2, 20);

        System.out.printf("You chose %d-sided dice.", sides);
    }

    public static void main(String[] args) {
        int operandOne = 13;
        int operandTwo = 7;

        double operandLeft = 4.25;
        double operandRight = 2.97;

        int sum = add(operandOne, operandTwo);
        double doubleSum = add(operandLeft, operandRight);

        System.out.printf("Add ints: %d + %d = %d%n", operandOne, operandTwo, sum);
        System.out.printf("Add doubles: %.2f + %.2f = %.2f%n", operandLeft, operandRight, doubleSum);

        int difference = subtract(operandOne, operandTwo);
        double doubleDifference = subtract(operandLeft, operandRight);

        System.out.printf("Subtract ints: %d - %d = %d%n", operandOne, operandTwo, difference);
        System.out.printf("Subtract doubles: %.2f + %.2f = %.2f%n", operandLeft, operandRight, doubleDifference);

        int product = multiply(operandOne, operandTwo);
        double doubleProduct = multiply(operandLeft, operandRight);

        System.out.printf("Multiply ints: %d * %d = %d%n", operandOne, operandTwo, product);
        System.out.printf("Multiply doubles: %.2f + %.2f = %.4f%n", operandLeft, operandRight, doubleProduct);

        double dividend = 42;
        double divisor = 17;

        double quotient = divide(dividend, divisor);

        System.out.printf("Divide: %.0f / %.0f = %.5f%n", dividend, divisor, quotient);

        int remainder = modulus(operandOne, operandTwo);

        System.out.printf("Modulus: %d %% %d = %d%n", operandOne, operandTwo, remainder);

//        System.out.printf("You entered: %d%n", getInteger(0, 99));

//        Scanner input = new Scanner(System.in);
//        System.out.println("Fun with factorial: ");
//        boolean userWantsToContinue = true;
//
//        do {
//            long userInt = getInteger(1, 39);
//            System.out.printf("%d! = %,d%n", userInt, factorial(userInt));
//
//            System.out.print("Continue? [y/n] ");
//            String userResponse = input.next();
//            userWantsToContinue = userResponse.contains("y");
//        } while (userWantsToContinue);

        // test of randomInteger method
//        int minRandInt = 10;
//        int maxRandInt = 0;
//        int testRand;
//
//        for (int i = 0; i < 1000; i++) {
//            testRand = randomInteger(0, 9);
//            if (testRand > maxRandInt) maxRandInt = testRand;
//            if (testRand < minRandInt) minRandInt = testRand;
//        }
//        System.out.printf("min: %d%n", minRandInt);
//        System.out.printf("max: %d%n", maxRandInt);

        rollDice();
    }
}
