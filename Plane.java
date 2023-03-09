public class Plane extends Vehicles{

    double wingSize;

    public Plane(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, double wingSize) {
        super(wheels, canFly, seats, maxSpeed, minSpeed);
        this.wingSize = wingSize;
    }
    
}
