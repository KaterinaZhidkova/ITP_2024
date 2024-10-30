package Exercise_1;

class Human extends Creature {
    @Override
    public void bear() {
        this.name = "Mike";
        this.isAlive = true;
        System.out.println("The human " + name + " was born");
    }
    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The human " + name + " has died\n");
    }
}
