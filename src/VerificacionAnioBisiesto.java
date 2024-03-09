
import java.util.Scanner;

public class VerificacionAnioBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un año: ");
        int anio = scanner.nextInt();

        if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}