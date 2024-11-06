package lab_11.Exercise_2;

public class Patient extends User {
    private Bill bill;
    public Patient(int id, String name) {
        super(id, name);
    }
    public void setBill(Bill bill) {
        this.bill = bill;
    }
    public Bill getBill() {
        return bill;
    }
    public void payBill() {
        if (bill != null) {
            bill.payBill();
        } else {
            System.out.println("No bills!");
        }
    }
}
