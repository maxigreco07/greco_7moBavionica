import java.util.Scanner;

public class MayorDeTresAND {
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

        // Determinar el mayor usando operadores AND
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("\nEl mayor es: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("\nEl mayor es: " + num2);
        } else {
            System.out.println("\nEl mayor es: " + num3);
        }
    }
}
