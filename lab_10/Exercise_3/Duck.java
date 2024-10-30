package Exercise_3;;

class Duck implements Swimmable, Flyable, Living {
    private boolean isSwimmingState = false;
    private boolean isFlyingState = false;
    @Override
    public void swim() {
        if (!isSwimmingState) {
            isSwimmingState = true;
            System.out.println("Duck starts swimming");
        } else {
            System.out.println("Duck is already swimming");
        }
    }
    public void stopSwimming () {
        if (isSwimmingState) {
            System.out.println("Duck stops swimming");
        } else {
            System.out.println("Duck is not swimming now");
        }

    }
    public void fly() {
        if (!isFlyingState) {
            isFlyingState = true;
            System.out.println("Duck starts flying");
        } else {
            System.out.println("Duck is already flying");
        }
    }
    public void stopFlying () {
        if (isFlyingState) {
            System.out.println("Duck stops flying");
        } else {
            System.out.println("Duck is not flying now");
        }
    }
}