package ejercicio15;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la duración de la mensualidad en días:");
        int dias = scanner.nextInt();

        int costoMensualidad = CalculoCostoGimnasio.calcularCosto(dias);

        if (costoMensualidad > 0) {
            System.out.println("El costo de la mensualidad es: $" + costoMensualidad);
        } else {
            System.out.println("Duración de mensualidad no válida. Por favor ingrese 15, 30 o 90 (3 meses).");
        }

        scanner.close();
    }
}

