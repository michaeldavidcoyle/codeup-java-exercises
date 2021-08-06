package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Doesn't the curriculum discourage using digits in variable names?
        Rectangle box1 = new Rectangle(5, 4);

        System.out.printf("box1 area: %f", box1.getArea());
        System.out.printf("%nbox1 perimeter: %f", box1.getPerimeter());

        Rectangle box2 = new Square(5);
        System.out.printf("%nbox2 area: %f", box2.getArea());
        System.out.printf("%nbox2 perimeter: %f", box2.getPerimeter());
    }
}
