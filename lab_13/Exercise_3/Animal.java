package lab_13.Exercise_3;

abstract class Animal {
    private int id;
    private String nickname;
    private Owner owner;
    public Animal(int id, String nickname, Owner owner) {
        this.id = id;
        this.nickname = nickname;
        this.owner = owner;
    }
    public int getId() {
        return id;
    }
    public String getNickname() {
        return nickname;
    }
    public Owner getOwner() {
        return owner;
    }
    @Override
    public String toString() {
        return "ID: " + id + ", Nickname: " + nickname + ", Owner: " + owner;
    }
}

class Cat extends Animal {
    private int purrLoudness;
    public Cat(int id, String nickname, Owner owner, int purrLoudness) {
        super(id, nickname, owner);
        this.purrLoudness = purrLoudness;
    }
    public int getPurrLoudness() {
        return purrLoudness;
    }
    @Override
    public String toString() {
        return super.toString() + ", Purr Loudness: " + purrLoudness;
    }
}

class Snake extends Animal {
    private int venomDanger;
    public Snake(int id, String nickname, Owner owner, int venomDanger) {
        super(id, nickname, owner);
        this.venomDanger = venomDanger;
    }
    public int getVenomDanger() {
        return venomDanger;
    }
    @Override
    public String toString() {
        return super.toString() + ", Venom Danger Level: " + venomDanger;
    }
}

class Rabbit extends Animal {
    private double earLength;
    public Rabbit(int id, String nickname, Owner owner, double earLength) {
        super(id, nickname, owner);
        this.earLength = earLength;
    }
    public double getEarLength() {
        return earLength;
    }
    @Override
    public String toString() {
        return super.toString() + ", Ear Length: " + earLength + " cm";
    }
}
