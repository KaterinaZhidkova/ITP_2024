package lab_11.Exercise_2;

abstract class User {
    protected int id;
    protected String name;
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
