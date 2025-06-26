import java.util.Scanner;

public class NivelEducativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de curso
        System.out.print("Ingrese el número de curso (0-12): ");
        int curso = scanner.nextInt();

        // Determinar el nivel educativo usando if-else
        if (curso == 0) {
            System.out.println("jardín de infantes");
        } else if (curso >= 1 && curso <= 6) {
            System.out.println("primaria");
        } else if (curso >= 7 && curso <= 12) {
            System.out.println("secundaria");
        } else {
            System.out.println("Curso no válido. Debe ser un valor entre 0 y 12.");
        }
    }
}
