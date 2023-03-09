
public class Vehicles {

    int wheels;
    int seats;
    boolean canFly;
    double maxSpeed;
    double minSpeed;

    public Vehicles(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed) {
        this.wheels = wheels;
        this.canFly = canFly;
        this.seats = seats;
        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
    }

    @Override
    public String toString() {
        return "Vehicles [wheels=" + wheels + ", canFly=" + canFly + ", maxSpeed=" + maxSpeed + ", minSpeed=" + minSpeed
                + "]";
    }

}
