package lab_11.Exercise_2;

public class Doctor extends User {
    public Doctor(int id, String name) {
        super(id, name);
    }
    public void checkPatient(Patient patient) {
        System.out.println("Doctor " + name + " checked patient " + patient.getName());
    }
}
