import java.util.Scanner;


public class Asteriscos {
    public static void main(String[] args) {
        System.out.println("enter a whole number :");
        Scanner scanner = new Scanner(System.in);

        int cantidad = scanner.nextInt();
        imprimirAsteriscos(cantidad);

        scanner.close();
    }

    public static void imprimirAsteriscos(int cantidad){

            for (int i= 0;i <= cantidad; i++){
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }



}
