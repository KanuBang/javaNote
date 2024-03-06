package solid.ex3;

public class BenzCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("Benz -> start Engine");
    }

    @Override
    public void offEngine() {
        System.out.println("Benz -> off Engine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Benz -> press accel");
    }
}
