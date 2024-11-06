package lab_11.Exercise_2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Patient patient = new Patient(101, "Mike");
        Receptionist receptionist = new Receptionist(111, "Pavel");
        Doctor doctor = new Doctor(112, "Sidorov");
        Bill bill = receptionist.generateBill(101, "Consultation", 150.0);
        patient.setBill(bill);
        System.out.println("We are glad to see you in out new Hospital Management System!");
        enum Role {
            PATIENT(),
            RECEPTIONIST,
            DOCTOR;
        }
        System.out.println("Please, choose who you are:");
        System.out.println("1 - Patient");
        System.out.println("2 - Receptionist");
        System.out.println("3 - Doctor");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Patient ID: " + patient.getId());
                System.out.println("Patient name: " + patient.getName());
                if (patient.getBill() != null) {
                    System.out.println("You have bills!");
                    System.out.println("Its amount: " + patient.getBill().getAmount() + "$");
                    System.out.println("Do you want to pay now? Y/N");
                    String answer = sc.next();
                    if (answer.equals("Y")) {
                        System.out.println("Bill " + bill.getName() + " was paid!");
                        break;
                    } else if (answer.equals("N")) {
                        System.out.println("Come back later!");
                        break;
                    } else {
                        System.out.println("Sorry, please try again later!");
                        break;
                    }
                }
                break;
            case 2:
                System.out.println("Receptionist ID: " + receptionist.getId());
                System.out.println("Receptionist name: " + receptionist.getName());
                receptionist.giveAppointment(patient);
                receptionist.generateBill(102, "Examination by a doctor", 250.0);
                break;
            case 3:
                System.out.println("Doctor ID: " + doctor.getId());
                System.out.println("Doctor name: " + doctor.getName());
                doctor.checkPatient(patient);
                break;
                default:
                    break;
        }
    }
}
