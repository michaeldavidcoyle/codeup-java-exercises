import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 3. Display a table of powers.
        // Prompt the user to enter an integer.
        // Display a table of squares and cubes from 1 to the value entered.
        // Ask if the user wants to continue.
        // Assume that the user will enter valid data.
        // Only continue if the user agrees to.
        // What number would you like to go up to? 5
        // Here is your table!
        //  number | squared | cubed
        //  ------ | ------- | -----
        //  1      | 1       | 1
        //  2      | 4       | 8
        //  3      | 9       | 27
        //  4      | 16      | 64
        //  5      | 25      | 125
        Scanner scanner = new Scanner(System.in);

        System.out.println("Table of Squares and Cubes");
        System.out.print("Please enter maximum integer value: ");
        int max = scanner.nextInt();

        int square;
        int cube;

        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int i = 1; i <= max; i++) {
            square = i * i;
            cube = square * i;

            System.out.printf("%-7d| %-7d | %-5d%n", i, square, cube);
        }
    }
}
