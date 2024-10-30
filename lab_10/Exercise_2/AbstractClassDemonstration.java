package Exercise_2;
import java.util.ArrayList;

public class AbstractClassDemonstration {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Human());
        animals.add(new Dog());
        for (Animal animal : animals) {
            animal.bear();
            animal.shoutName();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.bark();
            }
            animal.die();
        }
    }
}
