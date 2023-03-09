public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car(4, false, 4, 200, 0, "Жигули", 1994, 30, "Жёлтый", 0, false);

        car1.GetInfo();

        System.out.println("Старая цена: " + car1.GetPrice());
        car1.SetPrice(30.5);
        System.out.println("Новая цена: " + car1.GetPrice());

        car1.driveTo("Питер");
        car1.powerOn();
        car1.driveTo("Тбилиси");

    }
}
