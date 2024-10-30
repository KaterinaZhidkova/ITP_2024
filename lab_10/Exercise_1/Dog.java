package Exercise_1;

class Dog extends Creature{
    @Override
    public void bear() {
        this.name = "Rex";
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
