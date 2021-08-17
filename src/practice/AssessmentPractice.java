package practice;

public class AssessmentPractice {
    public static double multiply(int a, int b) {
        return a * b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void getMallardDetails(Mallard singleMallard) {
        System.out.println("This mallard's flight speed is " + singleMallard.getFlightSpeed());
    }

    public static void main(String[] args) {
        System.out.println(multiply(6, 7));

        System.out.println(multiply(6.1, 7.3));

        Mallard mallard = new Mallard(4, "Howard", 42);
        getMallardDetails(mallard);
    }
}
