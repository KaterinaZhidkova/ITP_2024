package lab_11.Exercise_2;

public class Receptionist extends User {
    public Receptionist(int id, String name) {
        super(id, name);
    }
    public Bill generateBill(int billId, String billName, double amount) {
        Bill newBill = new Bill(billId, billName, amount);
        System.out.println("The new bill is " + billName + " with price " + amount + "$");
        return newBill;
    }
    public void giveAppointment(Patient patient) {
        System.out.println("Appointment given to patient " + patient.getName());
    }
}
