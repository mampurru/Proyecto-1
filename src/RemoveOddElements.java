import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class RemoveOddElements {
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


        removeOddElements(list);


        System.out.println("List after removing odd elements: " + list);

        scanner.close();
    }


    static void removeOddElements(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 != 0) {
                iterator.remove();
            }
        }
    }
}
