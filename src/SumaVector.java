import java.util.Scanner;

public class SumaVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of elements for the vector: ");
        int numberOfElements = scanner.nextInt();


        int[] vector = new int[numberOfElements];


        System.out.println("Enter values for the vector:");
        for (int i = 0; i < numberOfElements; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }


        System.out.println("Vector created with values:");
        for (int value : vector) {
            System.out.print(value + " ");
        }


        int suma = sumarVector(vector);
        System.out.println("\nSum of the elements in the vector: " + suma);

        scanner.close();
    }


    static int sumarVector(int[] vector) {
        int suma = 0;
        for (int valor : vector) {
            suma += valor;
        }
        return suma;
    }
}
