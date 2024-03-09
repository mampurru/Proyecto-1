import java.util.Scanner;

public class ConversionMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al convertidor de moneda");
        System.out.println("Por favor ingresa la cantidad de dinero en la primera moneda:");
        double cantidadDinero = scanner.nextDouble();

        System.out.println("Ingresa la tasa de cambio de la primera moneda a la segunda:");
        double tasaCambio = scanner.nextDouble();

        double resultado = cantidadDinero * tasaCambio;

        System.out.println("La cantidad equivalente en la segunda moneda es: " + resultado);
    }
}