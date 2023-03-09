public class Bike extends Vehicles{

    boolean motor;
    boolean pedals;

    public Bike(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, boolean motor, boolean pedals) {
        super(wheels, canFly, seats, maxSpeed, minSpeed);
        this.motor = motor;
        this.pedals = pedals;
    }

    @Override
    public String toString() {
        return "Bike [motor=" + motor + ", pedals=" + pedals + "]";
    }
} 
    


    
