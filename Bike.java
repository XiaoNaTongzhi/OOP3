public class Bike extends Vehicles{

    private boolean motor;
    private boolean pedals;

    public Bike(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, boolean motor, boolean pedals) {
        super(wheels, canFly, seats, maxSpeed, minSpeed);
        this.setMotor(motor);
        this.setPedals(pedals);
    }


    public boolean isPedals() {
        return pedals;
    }


    public void setPedals(boolean pedals) {
        this.pedals = pedals;
    }


    public boolean isMotor() {
        return motor;
    }


    public void setMotor(boolean motor) {
        this.motor = motor;
    }


    @Override
    public String toString() {
        return "Bike [Мотор: " + isMotor() + ", Педали: " + isPedals() + "]";
    }
} 
    


    


    
