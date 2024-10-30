package Exercise_2;

abstract class Creature {
    public abstract void bear();
    public abstract void die();
    protected String name = null;
    protected boolean isAlive = false;
    public void shoutName() {
        if (name != null) {
            System.out.println("The name is " + name);
        } else {
            System.out.println("Error");
        }
    }
}
