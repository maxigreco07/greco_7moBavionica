import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Determinar si es par o impar usando un único if
        if (numero % 2 == 0) {
            System.out.println(numero + " es un número PAR");
        } else {
            System.out.println(numero + " es un número IMPAR");
        }
    }
}
