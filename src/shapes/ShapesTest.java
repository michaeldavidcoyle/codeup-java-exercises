package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Doesn't the curriculum discourage using digits in variable names?
        Rectangle box1 = new Rectangle(5, 4);

        System.out.printf("box1 area: %f%n", box1.getArea());
        System.out.printf("box1 perimeter: %f%n", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("box2 area: %f%n", box2.getArea());
        System.out.printf("box2 perimeter: %f%n", box2.getPerimeter());
    }
}
