package lab_11.Exercise_4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        System.out.println("If you want to stop adding string, write - 1");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("1")) {
            if (input.length() % 2 == 0) {
                set.add(input);
            }
            input = sc.nextLine();
        }
        System.out.println(set);
    }
}