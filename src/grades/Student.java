package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public double getGradeAverage() {
        double sum = 0;

        for (int grade : grades) {
            sum += grade;
        }

        return sum / grades.size();
    }

    public void displayStudentInfo(String username) {
        System.out.printf("Name: %s - GitHub Username: %s%n", this.getName(), username);
        System.out.printf("Grades: %s", this.getGrades());
        System.out.printf("%nCurrent Average: %.1f%n", this.getGradeAverage());
    }

    public static void main(String[] args) {
        Student studentOne = new Student("Bart");

        studentOne.addGrade(95);
        studentOne.addGrade(96);
        studentOne.addGrade(98);
        studentOne.addGrade(100);
        studentOne.addGrade(93);

        System.out.printf("%s's grade average is %.2f.", studentOne.getName(), studentOne.getGradeAverage());
    }
}
