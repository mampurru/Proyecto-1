import java.util.Scanner;

public class SumaDigitos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();


        scanner.close();


        int sumaDigitos = sumarDigitos(numero);


        System.out.println("La suma de los dígitos es: " + sumaDigitos);
    }


    private static int sumarDigitos(int numero) {
        int suma = 0;


        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }

        return suma;
    }
}
