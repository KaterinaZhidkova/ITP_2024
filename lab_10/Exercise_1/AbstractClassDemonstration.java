package Exercise_1;
import java.util.ArrayList;

public class AbstractClassDemonstration {
    public static void main(String[] args) {
        ArrayList<Creature> creatures = new ArrayList<>();
        creatures.add(new Human());
        creatures.add(new Dog());
        creatures.add(new Alien());
        for (Creature creature : creatures) {
            creature.bear();
            creature.shoutName();
            if (creature instanceof Dog) {
                Dog dog = (Dog) creature;
                dog.bark();
            }
            creature.die();
        }
    }
}
