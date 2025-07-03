import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número al usuario
        System.out.print("Ingrese un número para generar su tabla de multiplicar: ");
        int numero = scanner.nextInt();

        // Mostrar la tabla de multiplicar
        System.out.println("\nTabla de multiplicar del " + numero + ":");
        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %3d%n", numero, i, numero * i);
        }

        System.out.println("------------------------");
    }
}
