import java.util.Scanner;

public class CaracteristicasAuto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostrar menú de clases disponibles
        System.out.println("Clases de autos disponibles:");
        System.out.println("a - Clase A");
        System.out.println("b - Clase B");
        System.out.println("c - Clase C");

        // Solicitar la clase de auto
        System.out.print("\nIngrese la clase de auto (a, b o c): ");
        char clase = scanner.next().charAt(0);

        // Mostrar características usando switch
        System.out.println("\nCaracterísticas del auto:");

        switch (clase) {
            case 'a':
            case 'A':
                System.out.println("- 4 ruedas");
                System.out.println("- Motor");
                break;

            case 'b':
            case 'B':
                System.out.println("- 4 ruedas");
                System.out.println("- Motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                break;

            case 'c':
            case 'C':
                System.out.println("- 4 ruedas");
                System.out.println("- Motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                System.out.println("- Airbag");
                break;

            default:
                System.out.println("Clase no válida. Por favor ingrese a, b o c.");
        }
    }
}
