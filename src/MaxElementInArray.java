import java.util.Scanner;

public class MaxElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();


        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        int maxElement = findMaxElement(array);


        System.out.println("Max element in the array: " + maxElement);

        scanner.close();
    }


    static int findMaxElement(int[] array) {
        int maxElement = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > maxElement) {
                maxElement = array[i];
            }
        }

        return maxElement;
    }
}
