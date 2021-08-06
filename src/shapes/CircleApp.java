package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        System.out.print("Enter radius: ");
        double radius = input.getDouble();

        Circle circleOne = new Circle(radius);

        double areaOne = circleOne.getArea();
        double circumferenceOne = circleOne.getCircumference();

        System.out.printf("area: %f%ncircumference: %f%n", areaOne, circumferenceOne);
    }
}
