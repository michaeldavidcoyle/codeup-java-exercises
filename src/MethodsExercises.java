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

    public static int add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static void main(String[] args) {
        System.out.println(add(13, 7));
    }
}
