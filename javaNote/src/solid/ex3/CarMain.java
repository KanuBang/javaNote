package solid.ex3;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Car car1 = new K3Car();
        driver.setCar(car1);
        driver.drive();

        Car car2 = new Model3Car();
        driver.setCar(car2);
        driver.drive();

        Car car3 = new BenzCar();
        driver.setCar(car3);
        driver.drive();
    }
}
