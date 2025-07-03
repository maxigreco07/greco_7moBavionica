import java.util.Scanner;

public class VerificadorVocal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un carácter al usuario
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Convertir a minúscula para simplificar comparaciones
        char caracterMin = Character.toLowerCase(caracter);

        // Determinar si es vocal usando operadores OR
        if (caracterMin == 'a' || caracterMin == 'e' || caracterMin == 'i' ||
            caracterMin == 'o' || caracterMin == 'u') {
            System.out.println("'" + caracter + "' es una vocal.");
        } else {
            System.out.println("'" + caracter + "' NO es una vocal.");
        }
    }
}
