package Exercise_2;

final class Human extends Animal {
    @Override
    public void bear() {
        this.name = "Chris";
        this.isAlive = true;
        System.out.println("The human " + name + " was born");
    }
    @Override
    public void die() {
        this.isAlive = false;
        System.out.println("The human " + name + " has died\n");
    }
}
