import java.util.Scanner;

public class CalculoInteresCompuesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al calculador de interés compuesto");
        System.out.println("Por favor ingresa la cantidad inicial invertida:");
        double cantidadInicial = scanner.nextDouble();

        System.out.println("Ingresa la tasa de interés anual (en porcentaje):");
        double tasaInteresAnual = scanner.nextDouble() / 100;

        System.out.println("Ingresa el número de años de la inversión:");
        int numeroAnios = scanner.nextInt();

        double montoFinal = cantidadInicial * Math.pow((1 + tasaInteresAnual), numeroAnios);

        System.out.println("El monto final después de " + numeroAnios + " años es: " + montoFinal);
    }
}