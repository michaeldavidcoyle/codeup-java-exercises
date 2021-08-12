package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    private static void displayStudentInfo(HashMap<String, Student> students, String username) {
        Student student = students.get(username);

        System.out.printf("Name: %s - GitHub Username: %s%n", student.getName(), username);
        System.out.printf("Current Average: %.1f%n", student.getGradeAverage());
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

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students: ");

        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }

        System.out.print("\nWhat student would you like to see more information on? ");
        String userChoice = input.next();

        if (students.containsKey(userChoice)) {
            displayStudentInfo(students, userChoice);
        } else {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".", userChoice);
        }
       /*



> pizza


                Would you like to see another student?

> y

        What student would you like to see more information on?

> zgulde

        Name: Zach - GitHub Username: zgulde
        Current Average: 87.4

        Would you like to see another student?

> no

        Goodbye, and have a wonderful day!
        */
    }
}
