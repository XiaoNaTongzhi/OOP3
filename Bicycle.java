// с этим что-то не так, не пойму, что
public class Bicycle extends Bike{

String color;
    public Bicycle(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, boolean motor,
            boolean pedals, String color) {
        super(wheels, canFly, seats, maxSpeed, minSpeed, motor, pedals);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Bike [motor=" + motor + ", pedals=" + pedals + "]";
    }
    
}
