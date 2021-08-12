package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Gabriel");
        Student student2 = new Student("Martin");
        Student student3 = new Student("Reno");
        Student student4 = new Student("Frankie");

        for (int i = 0; i < 5; i++) {
            student1.addGrade(randomInteger(70, 100));
            student2.addGrade(randomInteger(70, 100));
            student3.addGrade(randomInteger(70, 100));
            student4.addGrade(randomInteger(70, 100));
        }

        students.put("fluffy", student1);
        students.put("martinmoreno", student2);
        students.put("cousinreno", student3);
        students.put("lilfrankie", student4);

        Scanner input = new Scanner(System.in);

        boolean userWantsToContinue;

        System.out.println("Welcome!");

        do {
            System.out.println("\nHere are the GitHub usernames of our students:\n");

            for (String key : students.keySet()) {
                System.out.printf("|%s| ", key);
            }

            System.out.println("\n\nWhat student would you like to see more information on? ");
            System.out.print("(Type \"all\" to see a list of all students): ");
            String userChoice = input.next();

            if (userChoice.equals("all")) {
                for (String key : students.keySet()) {
                    students.get(key).displayStudentInfo(key);
                    System.out.println();
                }
            } else if (students.containsKey(userChoice)) {
                System.out.println();
                students.get(userChoice).displayStudentInfo(userChoice);
            } else {
                System.out.printf("Sorry, no student found with the GitHub username of \"%s\".%n", userChoice);
            }

            System.out.print("Would you like to see another student? [y/n] ");
            String userResponse = input.next();
            userWantsToContinue = userResponse.toLowerCase().contains("y");
        } while (userWantsToContinue);

        System.out.println("Goodbye, and have a wonderful day!");
    }
}
