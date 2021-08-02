public class ControlFlowExercises {
    public static void main(String[] args) {
        // 2. FizzBuzz
        // Write a program that prints the numbers from 1 to 100.
        // For multiples of three: print “Fizz” instead of the number.
        // For the multiples of five: print “Buzz”.
        // For numbers which are multiples of both three and five: print “FizzBuzz”.
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
