public class Bus extends Vehicles {

    int stops;
    short doors;

    public Bus(int wheels, int seats, boolean canFly, double maxSpeed, double minSpeed, int stops, short doors) {
        super(wheels, canFly, seats, maxSpeed, minSpeed);
        this.stops = stops;
        this.doors = doors;

    }

    @Override
    public String toString() {
        return "Bus [stops=" + stops + ", doors=" + doors + "]";
    }

}
