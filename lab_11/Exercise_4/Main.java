package lab_11.Exercise_4;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        System.out.println("If you want to stop adding string, write - 1");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("1")) {
                set.add(input);
            input = sc.nextLine();
        }
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.length() % 2 != 0) {
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}
