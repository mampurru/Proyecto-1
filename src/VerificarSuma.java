import java.util.Scanner;
import java.util.Random;

public class VerificarSuma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int numero1 = random.nextInt(10) + 1;
        int numero2 = random.nextInt(10) + 1;


        int sumaCorrecta = numero1 + numero2;


        System.out.println("¿Cuál es la suma de " + numero1 + " y " + numero2 + "?");


        System.out.print("Ingrese su respuesta: ");
        int respuestaUsuario = scanner.nextInt();


        if (respuestaUsuario == sumaCorrecta) {
            System.out.println("¡Correcto! La suma es " + sumaCorrecta);
        } else {
            System.out.println("Incorrecto. La suma correcta es " + sumaCorrecta);
        }


        scanner.close();
    }
}
