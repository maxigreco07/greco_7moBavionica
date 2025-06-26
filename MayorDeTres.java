import java.util.Scanner;

public class MayorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números enteros
        System.out.println("Ingrese tres números enteros:");
        System.out.print("Número 1: ");
        int num1 = scanner.nextInt();

        System.out.print("Número 2: ");
        int num2 = scanner.nextInt();

        System.out.print("Número 3: ");
        int num3 = scanner.nextInt();

        // Determinar el mayor usando comparaciones
        int mayor = num1; // Suponemos que el primero es el mayor inicialmente

        if (num2 > mayor) {
            mayor = num2;
        }

        if (num3 > mayor) {
            mayor = num3;
        }

        // Mostrar el resultado
        System.out.println("\nEl mayor de los tres números es: " + mayor);
    }
}
