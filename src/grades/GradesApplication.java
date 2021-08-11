package grades;

import java.util.HashMap;

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

        System.out.println("Welcome!");
        System.out.println("Here are the GitHub usernames of our students: ");

        for (String key : students.keySet()) {
            System.out.printf("|%s| ", key);
        }
       /*


                What student would you like to see more information on?

> pizza

        Sorry, no student found with the GitHub username of "pizza".

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
