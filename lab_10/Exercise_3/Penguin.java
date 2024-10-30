package Exercise_3;

class Penguin implements Swimmable, Living {
    private boolean isSwimmingState = false;
    @Override
    public void swim() {
        if (!isSwimmingState) {
            isSwimmingState = true;
            System.out.println("Penguin starts swimming");
        } else {
            System.out.println("Penguin is already swimming");
        }
    }
    public void stopSwimming () {
        if (isSwimmingState) {
            System.out.println("Penguin stops swimming");
        } else {
            System.out.println("Penguin is not swimming now");
        }
    }
}