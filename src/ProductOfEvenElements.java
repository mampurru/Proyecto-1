import java.util.Scanner;

public class ProductOfEvenElements {
    public static void main(String[] args) {
        Scanner Elemets = new Scanner(System.in);


        System.out.print("Enter the size of the array: ");
        int size = Elemets.nextInt();


        int[] array = new int[size];


        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = Elemets.nextInt();
        }


        int product = calculateProductOfEvenElements(array);


        System.out.println("Product of even elements in the array: " + product);

        Elemets.close();
    }


    static int calculateProductOfEvenElements(int[] array) {
        int product = 1;

        for (int value : array) {
            if (value % 2 == 0) {
                product *= value;
            }
        }

        return product;
    }
}
