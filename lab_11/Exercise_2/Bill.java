package lab_11.Exercise_2;

public class Bill {
    private int billId;
    private String billName;
    private double amount;
    public Bill(int billId, String billName, double amount) {
        this.billId = billId;
        this.billName = billName;
        this.amount = amount;
    }
    public int getId() {
        return billId;
    }
    public String getName() {
        return billName;
    }
    public double getAmount() {
        return amount;
    }
    public void payBill() {
        System.out.println("Bill " + getName() + " was paid!");
    }
}
