import java.util.Scanner;

public class DiasDelMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del mes
        System.out.print("Ingrese el nombre del mes (ej. enero, febrero, etc.): ");
        String nombreMes = scanner.nextLine().toLowerCase();

        // Determinar la cantidad de días
        int dias = 0;
        String mesFormateado = "";

        // Usamos switch para manejar los diferentes meses
        switch(nombreMes) {
            case "abril":
            case "junio":
            case "septiembre":
            case "setiembre": // Consideramos ambas formas
            case "noviembre":
                dias = 30;
                mesFormateado = capitalizar(nombreMes);
                break;

            case "febrero":
                dias = 28;
                mesFormateado = "Febrero";
                break;

            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                dias = 31;
                mesFormateado = capitalizar(nombreMes);
                break;

            default:
                System.out.println("¡Error! Mes no válido.");
                return; // Salir del programa si el mes es inválido
        }

        // Mostrar el resultado
        System.out.println("\n" + mesFormateado + " tiene " + dias + " días.");
    }

    // Método auxiliar para capitalizar la primera letra
    private static String capitalizar(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
