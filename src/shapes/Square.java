package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return super.length * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(super.length, 2);
    }
}
