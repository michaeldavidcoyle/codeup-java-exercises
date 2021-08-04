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

    public static int subtract(int operandLeft, int operandRight) {
        return operandLeft - operandRight;
    }

    public static int multiply(int factor, int multiplier) {
        return factor * multiplier;
    }

    public static float divide(float dividend, float divisor) {
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int operandOne = 13;
        int operandTwo = 7;

        int sum = add(operandOne, operandTwo);

        System.out.printf("%d + %d = %d%n", operandOne, operandTwo, sum);

        int difference = subtract(operandOne, operandTwo);

        System.out.printf("%d - %d = %d%n", operandOne, operandTwo, difference);

        int product = multiply(operandOne, operandTwo);

        System.out.printf("%d * %d = %d%n", operandOne, operandTwo, product);

        float dividend = 42f;
        float divisor = 17f;

        float quotient = divide(dividend, divisor);

        System.out.printf("%.3f / %.3f = %.3f%n", dividend, divisor, quotient);
    }
}
