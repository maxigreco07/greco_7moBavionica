import java.util.Scanner;

public class EstadoAlumno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar las 3 evaluaciones
        System.out.println("Ingresa las 3 notas del alumno:");
        System.out.print("Nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Nota 3: ");
        double nota3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3.0;

        // Determinar el estado con un único if
        String estado;
        if (promedio >= 7) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }

        // Mostrar resultados
        System.out.println("\nResultado:");
        System.out.printf("Promedio: %.2f%n", promedio);
        System.out.println("Estado: " + estado);
    }
}

