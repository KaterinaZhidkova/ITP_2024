package Exercise_1;

class Alien extends Creature {
    @Override
    public void bear() {
        this.name = "Bob";
        this.isAlive = true;
        System.out.println("The alien " + name + " was born");
    }
    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The alien " + name + " has died\n");
    }
}
