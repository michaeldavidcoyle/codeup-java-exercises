package shapes;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getArea() {
//        System.out.println("square"); // tells if method is called from Square or Rectangle
        return Math.pow(super.length, 2);
    }

    @Override
    public double getPerimeter() {
//        System.out.println("square"); // tells if method is called from Square or Rectangle
        return super.length * 4;
    }
}
