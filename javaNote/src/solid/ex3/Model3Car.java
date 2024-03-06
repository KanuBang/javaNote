package solid.ex3;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("Model3Car -> start engine");
    }

    @Override
    public void offEngine() {
        System.out.println("Model3Car -> off engine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("Model3Car -> press accel");
    }
}
