package ejercicio9;

import java.util.Scanner;

public class DeterminarPositivoNeativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        if (numero > 0) {
            System.out.println(numero + " es un número positivo.");
        } else if (numero < 0) {
            System.out.println(numero + " es un número negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}

