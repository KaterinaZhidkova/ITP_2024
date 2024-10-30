package Exercise_3;

class Submarine implements Swimmable {
    private boolean isSwimmingState = false;

    @Override
    public void swim() {
        if (!isSwimmingState) {
            isSwimmingState = true;
            System.out.println("Submarine starts swimming");
        } else {
            System.out.println("Submarine is already swimming");
        }
    }
    @Override
    public void stopSwimming() {
        if (isSwimmingState) {
            isSwimmingState = false;
            System.out.println("Submarine stops swimming");
        } else {
            System.out.println("Submarine is not swimming now");
        }
    }
}