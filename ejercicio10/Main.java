package ejercicio10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el tipo de lavadora:");
        System.out.println("1. Lavadora grande");
        System.out.println("2. Lavadora pequeña");
        int tipoLavadora = scanner.nextInt();

        System.out.print("Ingrese la cantidad de horas de alquiler: ");
        int horasAlquiler = scanner.nextInt();

        int costoTotal = AlquilerLavadoras.calcularCostoAlquiler(tipoLavadora, horasAlquiler);

        System.out.println("El costo total a pagar es: $" + costoTotal);

        scanner.close();
    }
}
