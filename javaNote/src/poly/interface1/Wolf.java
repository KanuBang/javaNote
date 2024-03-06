package poly.interface1;

public class Wolf implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("아우~~~");
    }

    @Override
    public void move() {
        System.out.println("휘익휘익");
    }

}
