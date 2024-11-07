package lab_11.Exercise_5;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        System.out.println("Write your values, if you want to stop, write 'stop'");
        while (true) {
            String input = sc.nextLine().trim();
            if (input.equals("stop")) {
                break;
            }
            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1);
                System.out.println(input + " is already in the map, its amount is " + map.get(input));
            } else {
                map.put(input, 1);
            }
           }
        System.out.println("Values and their amount:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        }
    }

