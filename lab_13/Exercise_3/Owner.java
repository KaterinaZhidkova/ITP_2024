package lab_13.Exercise_3;

import java.util.Objects;

public class Owner {
    private String name;
    private String surname;
    private int age;
    public Owner(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }
    @Override
    public String toString() {
        return "Name and surname: " + name + " " + surname + ", Age: " + age;
    }
}
