package shapes;

public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double getArea() {
//        System.out.println("square"); // tells if method is called from Square or Rectangle
        return Math.pow(side, 2);
    }

    @Override
    public double getPerimeter() {
//        System.out.println("square"); // tells if method is called from Square or Rectangle
        return side * 4;
    }
}
