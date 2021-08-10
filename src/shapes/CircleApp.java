package shapes;

import util.Input;

public class CircleApp {
    private static int totalCircles;

    public static int getTotalCircles() {
        return totalCircles;
    }

    public static void setTotalCircles(int circlesCount) {
        totalCircles = circlesCount;
    }

    public static void main(String[] args) {
        Input input = new Input();

        boolean userWantsToContinue = true;
        setTotalCircles(0);

        do {
            System.out.print("Enter radius: ");
            double radius = input.getDouble();

            Circle circleOne = new Circle(radius);

            double areaOne = circleOne.getArea();
            double circumferenceOne = circleOne.getCircumference();

            System.out.printf("area: %f%ncircumference: %f%n", areaOne, circumferenceOne);

            setTotalCircles(getTotalCircles() + 1);

            System.out.print("Continue? ");
            userWantsToContinue = input.yesNo();
        } while (userWantsToContinue);

        System.out.printf("Total circles: %d", getTotalCircles());
    }
}
