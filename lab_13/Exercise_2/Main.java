package lab_13.Exercise_2;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Cat> cats = new HashSet<>();
        Set<Dog> dogs = new HashSet<>();
        addAnimals(cats, new Cat("Barsik", 5));
        addAnimals(cats, new Cat("Pushok", 7));
        addAnimals(dogs, new Dog("Rex", 10));
        addAnimals(dogs, new Dog("Sharik", 8));
        displayAnimals(cats);
        displayAnimals(dogs);
    }
    public static <T extends Animal> void addAnimals(Set<T> set, T animal) {
        set.add(animal);
    }
    public static void displayAnimals(Set<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println("Animal: " + animal.getNickname());
            animal.voice();
        }
    }
}
