public class Moped extends Bike{

    public Moped (int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, boolean motor,
            boolean pedals) {
        super(wheels, canFly, seats, maxSpeed, minSpeed, motor, pedals);
        
    }


    @Override
    public String toString() {
        return "Мопед [Мотор: " + isMotor() + ", Педали: " + isPedals() + ", Колёс: " + wheels + ", Летает ли: " + canFly + "]";
    }

}
