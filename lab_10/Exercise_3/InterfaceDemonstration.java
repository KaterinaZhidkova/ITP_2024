package Exercise_3;

public class InterfaceDemonstration {
    public static void main(String[] args) {
        Submarine submarine = new Submarine();
        submarine.swim();
        submarine.stopSwimming();
        Duck duck = new Duck();
        duck.swim();
        duck.stopSwimming();
        duck.fly();
        duck.stopFlying();
        duck.live();
        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.stopSwimming();
        penguin.live();
    }
}


