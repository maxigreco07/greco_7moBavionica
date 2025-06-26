import java.util.Scanner;

public class CategoriaFamiliar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la categoría al usuario
        System.out.print("Ingrese la categoría (a, b o c): ");
        char categoria = scanner.next().charAt(0);

        // Determinar la relación familiar usando switch
        switch (categoria) {
            case 'a':
            case 'A':
                System.out.println("hijo");
                break;

            case 'b':
            case 'B':
                System.out.println("padres");
                break;

            case 'c':
            case 'C':
                System.out.println("abuelos");
                break;

            default:
                System.out.println("Categoría inválida. Debe ser 'a', 'b' o 'c'.");
        }
    }
}
