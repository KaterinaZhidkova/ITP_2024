package lab_11.Exercise_3;
import java.util.*;

public class Main {
    ArrayList<String> animals = new ArrayList<>();

    public void addAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal to add: ");
        String animal = input.nextLine();
        animals.add(animal);
        System.out.println(animal + " was added to the list");
    }

    public void removeAnimal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter animal to remove: ");
        String animal = input.nextLine();
        animals.remove(animal);
        System.out.println(animal + " was removed from the list");
    }

    public void updateAnimals() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter what animal to update and particular one: ");
        String animal_to_remove = input.next();
        input.nextLine();
        String animal_to_add = input.nextLine();
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).equals(animal_to_remove)) {
                animals.set(i, animal_to_add);
                break;
            }
        }
        System.out.println(animal_to_remove + " was updated to " + animal_to_add);
    }

    public void displayAnimals() {
        System.out.println(animals);
    }

    public static void main(String[] args) {
        Main animals = new Main();
        System.out.println("Choose what do you want to do:");
        System.out.println("1. Add new animal");
        System.out.println("2. Remove animal");
        System.out.println("3. Update animal");
        System.out.println("4. Display animals");
        System.out.println("5. Done!");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != 5) {
            switch (input) {
                case 1:
                    animals.addAnimal();
                    input = sc.nextInt();
                    break;
                case 2:
                    animals.removeAnimal();
                    input = sc.nextInt();
                    break;
                case 3:
                    animals.updateAnimals();
                    input = sc.nextInt();
                    break;
                case 4:
                    animals.displayAnimals();
                    input = sc.nextInt();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}