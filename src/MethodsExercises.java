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

    public static float add(float addendLeft, float addendRight) {
        return addendLeft + addendRight;
    }

    public static int subtract(int operandLeft, int operandRight) {
        return operandLeft - operandRight;
    }

    public static float subtract(float operandLeft, float operandRight) {
        return operandLeft - operandRight;
    }

    public static int multiply(int factor, int multiplier) {
        return factor * multiplier;
    }

    public static float multiply(float factor, float multiplier) {
        return factor * multiplier;
    }

    public static float divide(float dividend, float divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int operandOne = 13;
        int operandTwo = 7;

        float operandLeft = 4.25f;
        float operandRight = 2.97f;

        int sum = add(operandOne, operandTwo);
        float floatSum = add(operandLeft, operandRight);

        System.out.printf("Add ints: %d + %d = %d%n", operandOne, operandTwo, sum);
        System.out.printf("Add floats: %.2f + %.2f = %.2f%n", operandLeft, operandRight, floatSum);

        int difference = subtract(operandOne, operandTwo);
        float floatDifference = subtract(operandLeft, operandRight);

        System.out.printf("Subtract ints: %d - %d = %d%n", operandOne, operandTwo, difference);
        System.out.printf("Subtract floats: %.2f + %.2f = %.2f%n", operandLeft, operandRight, floatDifference);

        int product = multiply(operandOne, operandTwo);
        float floatProduct = multiply(operandLeft, operandRight);

        System.out.printf("Multiply ints: %d * %d = %d%n", operandOne, operandTwo, product);
        System.out.printf("Multiply floats: %.2f + %.2f = %.2f%n", operandLeft, operandRight, floatProduct);

        float dividend = 42f;
        float divisor = 17f;

        float quotient = divide(dividend, divisor);

        System.out.printf("Divide: %.3f / %.3f = %.3f%n", dividend, divisor, quotient);
    }
}
