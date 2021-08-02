import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//
//        System.out.format("The value of pi is approximately %.2f.%n", pi);

        // Prompt user to enter an integer and store that value in an int variable using the nextInt method.
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        int userInteger = scanner.nextInt();
//
//        System.out.format("You entered: %d%n", userInteger);

        // Prompt user to enter 3 words and store each in a separate variable.
        // Display them in the console, each on a newline.
//        System.out.print("Enter 3 words: ");
//
//        String userWordOne = scanner.next();
//        String userWordTwo = scanner.next();
//        String userWordThree = scanner.next();
//
//        System.out.format("%s%n%s%n%s%n", userWordOne, userWordTwo, userWordThree);

        // Prompt a user to enter a sentence, then store that sentence in a String variable using the next method.
        // Then, display that sentence back to the user.
        System.out.print("Enter a sentence: ");

        String userSentence = scanner.nextLine();

        System.out.println(userSentence);
    }
}
