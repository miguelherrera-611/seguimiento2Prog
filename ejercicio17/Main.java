package ejercicio17;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de copias que desea imprimir:");
        int cantidadCopias = scanner.nextInt();

        CostoImpresion.calcularCostoImpresion(cantidadCopias);

        scanner.close();
    }
}
