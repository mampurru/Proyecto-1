import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class RemoveKeysLessThanValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 10);
        hashMap.put("B", 5);
        hashMap.put("C", 15);
        hashMap.put("D", 8);


        System.out.println("HashMap before removing keys: " + hashMap);


        System.out.print("Enter a number to compare: ");
        int threshold = scanner.nextInt();


        removeKeysLessThanValue(hashMap, threshold);


        System.out.println("HashMap after removing keys: " + hashMap);

        scanner.close();
    }


    static void removeKeysLessThanValue(Map<String, Integer> map, int threshold) {
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < threshold) {
                iterator.remove();
            }
        }
    }
}
