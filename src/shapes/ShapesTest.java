package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        // Doesn't the curriculum discourage using digits in variable names?
        Rectangle box1 = new Rectangle(5, 4);

        System.out.printf("box1 area: %f", box1.getArea());
        System.out.printf("%nbox1 perimeter: %f", box1.getPerimeter());
    }
}
