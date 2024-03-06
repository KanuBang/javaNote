package poly.interface1;

public class Cat implements InterfaceAnimal {
    @Override
    public void sound() {
        System.out.println("냐용");
    }

    @Override
    public void move() {
        System.out.println("살금 살금");
    }

}
