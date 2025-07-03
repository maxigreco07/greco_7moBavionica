import java.util.Scanner;

public class DiasDelMesSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el nombre del mes
        System.out.print("Ingrese el nombre del mes (ej. enero, febrero, etc.): ");
        String nombreMes = scanner.nextLine().toLowerCase();

        // Determinar la cantidad de días usando switch
        int dias = 0;
        String mesFormateado = "";

        switch (nombreMes) {
            case "enero":
                mesFormateado = "Enero";
                dias = 31;
                break;

            case "febrero":
                mesFormateado = "Febrero";
                dias = 28;
                break;

            case "marzo":
                mesFormateado = "Marzo";
                dias = 31;
                break;

            case "abril":
                mesFormateado = "Abril";
                dias = 30;
                break;

            case "mayo":
                mesFormateado = "Mayo";
                dias = 31;
                break;

            case "junio":
                mesFormateado = "Junio";
                dias = 30;
                break;

            case "julio":
                mesFormateado = "Julio";
                dias = 31;
                break;

            case "agosto":
                mesFormateado = "Agosto";
                dias = 31;
                break;

            case "septiembre":
            case "setiembre":  // Maneja ambas formas de escribir
                mesFormateado = "Septiembre";
                dias = 30;
                break;

            case "octubre":
                mesFormateado = "Octubre";
                dias = 31;
                break;

            case "noviembre":
                mesFormateado = "Noviembre";
                dias = 30;
                break;

            case "diciembre":
                mesFormateado = "Diciembre";
                dias = 31;
                break;

            default:
                System.out.println("\nError: Mes no válido. Por favor ingrese un mes válido.");
                return; // Salir del programa si el mes es inválido
        }

        // Mostrar el resultado
        System.out.println("\n" + mesFormateado + " tiene " + dias + " días.");
    }
}
