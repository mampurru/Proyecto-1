import java.util.Scanner;

public class ContarDigitosRepetidos {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingrese un número entero positivo: ");
        int numero = validarEnteroPositivo(scanner);


        System.out.print("Ingrese un dígito: ");
        int digito = validarDigito(scanner);

        int cantidadApariciones = contarAparicionesDigitos(numero, digito);
        System.out.println("El dígito " + digito + " aparece " + cantidadApariciones + " veces en el número " + numero);


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


    private static int validarDigito(Scanner scanner) {
        int digito;

        do {
            while (!scanner.hasNextInt()) {
                System.out.print("Ingrese un dígito válido: ");
                scanner.next(); // Consumir la entrada no válida
            }

            digito = scanner.nextInt();

            if (digito < 0 || digito > 9) {
                System.out.print("Ingrese un dígito válido (entre 0 y 9): ");
            }
        } while (digito < 0 || digito > 9);

        return digito;
    }


    private static int contarAparicionesDigitos(int numero, int digito) {
        int contador = 0;

        while (numero > 0) {
            int digitoActual = numero % 10;
            if (digitoActual == digito) {
                contador++;
            }
            numero /= 10;
        }

        return contador;
    }
}

