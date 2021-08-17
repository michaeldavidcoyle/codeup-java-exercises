package practice;

public class Mallard extends Duck implements Quackable {
    private int flightSpeed;

    public Mallard(int age, String name, int flightSpeed) {
        super(age, name);

        this.flightSpeed = flightSpeed;
    }

    public int getFlightSpeed() {
        return this.flightSpeed;
    }

    public void setFlightSpeed(int flightSpeed) {
        this.flightSpeed = flightSpeed;
    }

    @Override
    public void quack() {
        System.out.println("Quack, quack!");
    }
}
