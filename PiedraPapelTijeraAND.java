import java.util.Scanner;

public class PiedraPapelTijeraAND {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Explicación del juego
        System.out.println("¡Piedra, Papel o Tijera!");
        System.out.println("0 = Piedra, 1 = Papel, 2 = Tijera");

        // Solicitar jugadas
        System.out.print("\nCompetidor 1, ingrese su jugada (0-2): ");
        int jugador1 = scanner.nextInt();

        System.out.print("Competidor 2, ingrese su jugada (0-2): ");
        int jugador2 = scanner.nextInt();

        // Validar entradas
        if ((jugador1 < 0 || jugador1 > 2) || (jugador2 < 0 || jugador2 > 2)) {
            System.out.println("Error: Las jugadas deben ser 0, 1 o 2");
            return;
        }

        // Determinar el ganador usando operadores AND (&&)
        String resultado;

        if (jugador1 == jugador2) {
            resultado = "¡Empate!";
        }
        // Combinaciones donde gana el Competidor 1
        else if ((jugador1 == 0 && jugador2 == 2) ||
                 (jugador1 == 1 && jugador2 == 0) ||
                 (jugador1 == 2 && jugador2 == 1)) {
            resultado = "¡Gana el Competidor 1!";
        }
        // Cualquier otra combinación (gana Competidor 2)
        else {
            resultado = "¡Gana el Competidor 2!";
        }

        // Mostrar resultados
        String[] nombres = {"Piedra", "Papel", "Tijera"};
        System.out.println("\nCompetidor 1: " + nombres[jugador1]);
        System.out.println("Competidor 2: " + nombres[jugador2]);
        System.out.println("\n" + resultado);

        // Explicación de las condiciones
        System.out.println("\nExplicación de condiciones AND:");
        System.out.println("1. Piedra(0) gana a Tijera(2): " + (jugador1 == 0 && jugador2 == 2));
        System.out.println("2. Papel(1) gana a Piedra(0): " + (jugador1 == 1 && jugador2 == 0));
        System.out.println("3. Tijera(2) gana a Papel(1): " + (jugador1 == 2 && jugador2 == 1));
    }
}
