import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Prompt user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int userInteger = scanner.nextInt();

        System.out.format("You entered: %d%n", userInteger);
    }
}
