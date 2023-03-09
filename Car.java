public class Car extends Vehicles{
    private String model;
    private int year;
    private double price;
    String color;
    int power;
    boolean engineOn;

    
    
    public Car(int wheels, boolean canFly, int seats, double maxSpeed, double minSpeed, String model, int year,
            double price, String color, int power, boolean engineOn) {
        super(wheels, canFly, seats, maxSpeed, minSpeed);
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.engineOn = engineOn;
    }

    

    public void GetInfo() {
        System.out.println(
                "Модель: " + model + ", " +
                        "Год: " + year + ", " +
                        "Стоимость: " + price + ", " +
                        "Цвет: " + color + ", " +
                        "Мощность: " + power);
    }

    public String GetModel() {
        return model;
    }

    public void SetModel(String model) {
        this.model = model;
    }

    public int GetYear() {
        return year;
    }

    public void SetYear(int year) {
        this.year = year;
    }

    public double GetPrice() {
        return price;
    }

    public void SetPrice(Double price) {
        this.price = price;
    }

    public void powerOn() {
        if (!engineOn) {
            this.engineOn = true;
            System.out.println("Машина завелась.");
        } else {
            System.out.println("Машина уже заведена.");
        }
    }

    public void powerOff() {
        if (engineOn) {
            this.engineOn = false;
            System.out.println("Двигатель остановлен.");
        } else {
            System.out.println("Машина не работает.");
        }
    }

    public void driveTo(String place) {
        if (!engineOn) {
            System.out.println("Чтобы ехать, нужно сначала завести машину.");
        } else {
            System.out.printf("Едем на %s в %s.\n", model, place);
        }
    }

}
