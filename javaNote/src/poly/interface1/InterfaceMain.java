package poly.interface1;

public class InterfaceMain {
    public static void main(String[] args) {
        InterfaceAnimal[] animals = {new Cat(), new Dog(), new Wolf()};
        for (InterfaceAnimal animal : animals) {
            soundAnimal(animal);
            moveAnimal(animal);
        }
        System.out.println(InterfaceAnimal.info);
    }

    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        animal.move();
    }
}
