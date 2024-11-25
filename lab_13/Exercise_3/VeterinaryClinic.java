package lab_13.Exercise_3;

import java.util.Map;
import java.util.HashMap;

public class VeterinaryClinic {
    private Map<Integer, Animal> pets = new HashMap<>();
    public void addPet(Animal pet) {
        if (pets.containsKey(pet.getId())) {
            System.out.println("A pet with ID " + pet.getId() + " already in clinic!");
        } else {
            pets.put(pet.getId(), pet);
            System.out.println("Added pet: " + pet);
        }
    }
    public void displayPets() {
        if (pets.isEmpty()) {
            System.out.println("No pets in the clinic");
        } else {
            for (Animal pet : pets.values()) {
                System.out.println(pet);
            }
        }
    }
    public Map<Integer, Animal> getPets() {
        return pets;
    }
}
