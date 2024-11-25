package lab_13.Exercise_3;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic();
        Owner owner1 = new Owner("Artem", "Sidorov", 30);
        Owner owner2 = new Owner("Marta", "Bulkina", 25);
        Animal cat1 = new Cat(1, "Snowflake", owner1, 5);
        Animal cat2 = new Cat(2, "Snowball", owner2, 7);
        Animal snake1 = new Snake(3, "Rick", owner1, 8);
        Animal rabbit1 = new Rabbit(4, "Ron", owner2, 5.5);
        clinic.addPet(cat1);
        clinic.addPet(cat2);
        clinic.addPet(snake1);
        clinic.addPet(rabbit1);
        Animal duplicateCat = new Cat(1, "Lexus", owner2, 10);
        clinic.addPet(duplicateCat);
        System.out.println("All pets in the clinic:");
        clinic.displayPets();
    }
}
