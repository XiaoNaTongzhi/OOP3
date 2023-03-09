public class Bicycle extends Bike
{

    public Bicycle(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, boolean motor,
            boolean pedals) {
        super(wheels, canFly, seats, maxSpeed, minSpeed, motor, pedals);
        
    }

    @Override
    public String toString() {
        return "Bicycle []";
    }
    
}
