import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveKeysLessThan {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("A", 10);
        hashMap.put("B", 5);
        hashMap.put("C", 8);
        hashMap.put("D", 3);
        hashMap.put("E", 12);


        System.out.println("HashMap before removal: " + hashMap);

        int thresholdValue = 8;

        removeKeysLessThan(hashMap, thresholdValue);


        System.out.println("HashMap after removal: " + hashMap);
    }


    private static void removeKeysLessThan(Map<String, Integer> hashMap, int thresholdValue) {
        Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();

            if (entry.getValue() < thresholdValue) {
                iterator.remove();
            }
        }
    }
}
