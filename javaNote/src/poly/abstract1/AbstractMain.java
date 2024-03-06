package poly.abstract1;

public class AbstractMain {
    public static void main(String[] args) {
        AbstarctAnimal[] animals = {new Cat(), new Dog(), new Wolf()};
        for (AbstarctAnimal animal : animals){
            soundAnimal(animal);
        }
    }

    private static void soundAnimal(AbstarctAnimal animal) {
        animal.sound();
    }
}
