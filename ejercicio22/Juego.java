package ejercicio22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {

    private int[] mazo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private List<Integer> cartasJugador;
    private List<Integer> cartasComputadora;
    private Random random;

    public Juego() {
        cartasJugador = new ArrayList<>();
        cartasComputadora = new ArrayList<>();
        random = new Random();
    }

    public void jugar(Scanner scanner) {
        cartasJugador.add(cartaAleatoria());
        cartasJugador.add(cartaAleatoria());
        cartasComputadora.add(cartaAleatoria());
        cartasComputadora.add(cartaAleatoria());

        System.out.println("Tus cartas son: " + cartasJugador.toString());

        int puntuacionJugador = calcularPuntuacion(cartasJugador);
        int puntuacionComputadora = calcularPuntuacion(cartasComputadora);

        System.out.println("La carta visible de la computadora es: " + cartasComputadora.get(0));

        while (true) {
            System.out.print("¿Quieres otra carta? Presiona 'A' para pedir otra carta, o 'P' para parar: ");
            String decision = scanner.nextLine().toUpperCase();

            if (decision.equals("A")) {
                int nuevaCarta = cartaAleatoria();
                cartasJugador.add(nuevaCarta);
                puntuacionJugador = calcularPuntuacion(cartasJugador);
                System.out.println("Has recibido una carta: " + nuevaCarta);
                System.out.println("Tus cartas ahora son: " + cartasJugador.toString());

                if (puntuacionJugador > 21) {
                    System.out.println("Te has pasado de 21. ¡Has perdido!");
                    break;
                }
            } else if (decision.equals("P")) {
                break;
            } else {
                System.out.println("Opción no válida. Por favor, presiona 'A' o 'P'.");
            }
        }

        while (puntuacionComputadora < 16) {
            int nuevaCarta = cartaAleatoria();
            cartasComputadora.add(nuevaCarta);
            puntuacionComputadora = calcularPuntuacion(cartasComputadora);
            System.out.println("La computadora ha recibido una carta: " + nuevaCarta);
        }

        System.out.println("\nPuntuación final:");
        System.out.println("Tus cartas: " + cartasJugador.toString() + " - Puntuación: " + puntuacionJugador);
        System.out.println("Cartas de la computadora: " + cartasComputadora.toString() + " - Puntuación: " + puntuacionComputadora);

        determinarGanador(puntuacionJugador, puntuacionComputadora);
    }

    private int cartaAleatoria() {
        return mazo[random.nextInt(mazo.length)];
    }

    private int calcularPuntuacion(List<Integer> cartas) {
        int puntuacion = 0;
        for (int carta : cartas) {
            puntuacion += carta;
        }
        return puntuacion;
    }

    private void determinarGanador(int puntuacionJugador, int puntuacionComputadora) {
        if (puntuacionJugador > 21) {
            System.out.println("La computadora gana. ¡Te has pasado de 21!");
        } else if (puntuacionComputadora > 21) {
            System.out.println("¡Ganaste! La computadora se ha pasado de 21.");
        } else if (puntuacionJugador > puntuacionComputadora) {
            System.out.println("¡Ganaste! Tu puntuación es mayor que la de la computadora.");
        } else if (puntuacionJugador < puntuacionComputadora) {
            System.out.println("La computadora gana. Su puntuación es mayor que la tuya.");
        } else {
            System.out.println("Es un empate. Ambos tienen la misma puntuación.");
        }
    }
}

