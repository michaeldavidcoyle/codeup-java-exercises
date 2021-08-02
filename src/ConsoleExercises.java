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
//        System.out.print("Enter a sentence: ");
//
//        String userSentence = scanner.nextLine();
//
//        System.out.println(userSentence);

        // Prompt the user to enter values of length and width of a classroom at Codeup.
        //Use the nextLine method to get user input and parse the resulting string to a numeric type.
        System.out.print("Enter length: ");
        String lengthString = scanner.nextLine();

        System.out.print("Enter width: ");
        String widthString = scanner.nextLine();

        System.out.print("Enter height: ");
        String heightString = scanner.nextLine();

//        int length = Integer.parseInt(lengthString);
//        int width = Integer.parseInt(widthString);

        float length = Float.parseFloat(lengthString);
        float width = Float.parseFloat(widthString);
        float height = Float.parseFloat(heightString);

        System.out.format("area: %.1f%n", length * width);
        System.out.format("volume: %.1f%n", length * width * height);
        System.out.format("perimeter: %.1f%n", (length * 2) + (width * 2));
    }
}
