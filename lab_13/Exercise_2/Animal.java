package lab_13.Exercise_2;

import java.util.Objects;

abstract class Animal {
    protected String nickname;
    public Animal(String nickname) {
        this.nickname = nickname;
    }
    public String getNickname() {
        return nickname;
    }
    public abstract void voice();
}

class Cat extends Animal {
    private int purrLoudness;
    public Cat(String nickname, int purrLoudness) {
        super(nickname);
        this.purrLoudness = purrLoudness;
    }
    public int getPurrLoudness() {
        return purrLoudness;
    }
    @Override
    public void voice() {
        System.out.println(nickname + " meowed with purr loudness " + purrLoudness);
    }
}

class Dog extends Animal {
    private int barkingLoudness;

    public Dog(String nickname, int barkingLoudness) {
        super(nickname);
        this.barkingLoudness = barkingLoudness;
    }

    public int getBarkingLoudness() {
        return barkingLoudness;
    }

    @Override
    public void voice() {
        System.out.println(nickname + " barked with barking loudness " + barkingLoudness);
    }
}
