import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter elements of the list (enter any non-integer to stop): ");

        List<Integer> list = new ArrayList<>();


        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int element = scanner.nextInt();
                list.add(element);
            } else {
                break;
            }
        }


        removeDuplicates(list);


        System.out.println("List after removing duplicates: " + list);

        scanner.close();
    }


    static void removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueSet = new HashSet<>(list);
        list.clear();
        list.addAll(uniqueSet);
    }
}
