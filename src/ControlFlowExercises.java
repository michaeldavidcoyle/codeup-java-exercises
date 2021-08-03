import java.util.Locale;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        // 4. Convert given number grades into letter grades.
        // Prompt the user for a numerical grade from 0 to 100.
        // Display the corresponding letter grade.
        // Prompt the user to continue.
        // Assume that the user will enter valid integers for the grades.
        // The application should only continue if the user agrees to.
        // Grade Ranges:
        // A : 100 - 88
        // B : 87 - 80
        // C : 79 - 67
        // D : 66 - 60
        // F : 59 - 0
        // Bonus - Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+)
        Scanner scanner = new Scanner(System.in);

        boolean userWantsToContinue = false;

        System.out.println("Convert number grades to letter grades.");
        do {
            System.out.print("Please enter a numerical grade from 0 to 100: ");
            int numericGrade = scanner.nextInt();

            String letterGrade;

            if (numericGrade >= 97) {
                letterGrade = "A+";
            } else if (numericGrade >= 92) {
                letterGrade = "A";
            } else if (numericGrade >= 88) {
                letterGrade = "A-";
            } else if (numericGrade >= 85) {
                letterGrade = "B+";
            } else if (numericGrade >= 83) {
                letterGrade = "B";
            } else if (numericGrade >= 80) {
                letterGrade = "B-";
            } else if (numericGrade >= 76) {
                letterGrade = "C+";
            } else if (numericGrade >= 71) {
                letterGrade = "C";
            } else if (numericGrade >= 67) {
                letterGrade = "C-";
            } else if (numericGrade >= 65) {
                letterGrade = "D+";
            } else if (numericGrade >= 62) {
                letterGrade = "D";
            } else if (numericGrade >= 60) {
                letterGrade = "D-";
            } else {
                letterGrade = "F";
            }

            System.out.printf("A numeric grade of %d%% is a letter grade of %s%n", numericGrade, letterGrade);

            System.out.print("Do you want to go again? ");
            userWantsToContinue = scanner.next().toLowerCase().contains("y");
        } while (userWantsToContinue);
    }
}
