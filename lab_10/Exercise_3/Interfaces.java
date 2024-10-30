package Exercise_3;

interface Swimmable {
    void swim();
    void stopSwimming();
}

interface Flyable {
    void fly();
    void stopFlying();
}

interface Living {
    default void live() {
        System.out.println(getClass().getName() + " lives");
    }
}