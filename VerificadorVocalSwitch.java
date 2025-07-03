import java.util.Scanner;

public class VerificadorVocalSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar un carácter al usuario
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().charAt(0);

        // Determinar si es vocal usando switch
        switch (caracter) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                System.out.println("'" + caracter + "' es una vocal.");
                break;
            default:
                System.out.println("'" + caracter + "' NO es una vocal.");
        }
    }
}
