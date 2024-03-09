import java.util.Scanner;

public class MaximoComunDivisor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese el primer número entero positivo: ");
        int numero1 = validarEnteroPositivo(scanner);

        System.out.print("Ingrese el segundo número entero positivo: ");
        int numero2 = validarEnteroPositivo(scanner);


        int mcd = calcularMCD(numero1, numero2);
        System.out.println("El Máximo Común Divisor (MCD) de " + numero1 + " y " + numero2 + " es: " + mcd);


        scanner.close();
    }


    private static int validarEnteroPositivo(Scanner scanner) {
        int numero;

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un número entero positivo válido: ");
                scanner.next();
            }

            numero = scanner.nextInt();

            if (numero <= 0) {
                System.out.print("Ingrese un número entero positivo válido: ");
            }
        } while (numero <= 0);

        return numero;
    }


    private static int calcularMCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
