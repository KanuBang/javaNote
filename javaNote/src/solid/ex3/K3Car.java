package solid.ex3;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3CAR -> start engine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3CAR -> off engine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3CAR -> press accel");
    }
}
