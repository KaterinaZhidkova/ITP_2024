package Exercise_2;

final class Dog extends Animal {
    @Override
    public void bear() {
        this.name = "Sharik";
        this.isAlive = true;
        System.out.println("The dog " + name + " was born");
    }
    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The dog " + name + " has died\n");
    }
    public void bark() {
        System.out.println("The dog " + name + " barked");
    }
}
