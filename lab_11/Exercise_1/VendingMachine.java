package lab_11.Exercise_1;
import java.util.Scanner;

public class VendingMachine {
    enum Drinks {
        COCE_COLA("Coce-Cola", 2.5),
        SPRITE("Sprite", 2.0),
        FANTA("Fanta", 1.5);
        private String name;
        private double price;

        Drinks(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }
    }

    enum Money {
        ONE(1),
        TWO(2),
        FIVE(5),
        TEN(10),
        TWENTY(20),
        FIFTY(50),
        ONE_THOUSAND(100);
        private int denomination;

        Money(int denomination) {
            this.denomination = denomination;
        }

        public int getDenomination() {
            return denomination;
        }

        public static Money closestDenomination(double change) {
            Money result = ONE;
            for (Money money : Money.values()) {
                if (money.getDenomination() <= change) {
                    result = money;
                } else {
                    break;
                }
            }
            return result;
        }
    }
    public static void main(String[] args) {
        System.out.println("Drinks:");
        for (Drinks drink : Drinks.values()) {
            System.out.println(drink.getName() + " " + drink.getPrice()+"$");
        }
        System.out.println("Please, insert money");
        Scanner sc = new Scanner(System.in);
        String money_str = sc.nextLine();
        double money = Double.parseDouble(money_str);
        System.out.println("Please, choose drink");
        String drink = sc.nextLine();
        int flag_money = 0;
        int flag_drink = 0;
        if (!(drink.equals("Coce-Cola") || drink.equals("Sprite") || drink.equals("Fanta"))) {
            System.out.println("Invalid drink!");
        } else {
            flag_drink = 1;
        }
        if (money < 0) {
            System.out.println("Negative values!");
        }
        else if (money > 0 && money < 1.5) {
            System.out.println("Not enough money!");
        }
        else if (!(money == 1 || money == 2 || money == 5 || money == 10 || money == 20 || money == 50 || money == 100)) {
            System.out.println("You inserted coins or invalid denomination!");
        } else {
            flag_money = 1;
        }
        if (flag_money > 0 && flag_drink > 0) {
            drink = drink.toUpperCase();
            Drinks drink_value = Drinks.valueOf(drink);
            if (money == drink_value.getPrice()) {
                System.out.println("You got " + drink_value.getName() + " with no change");
            } else if (money < drink_value.getPrice()) {
                System.out.println("Not enough money!");
            } else if (money > drink_value.getPrice()) {
                Money change = Money.closestDenomination(money - drink_value.getPrice());
                System.out.println("You got " + drink_value.getName() + " with " + change.getDenomination() + "$ change!");
            }

        }
    }
}
