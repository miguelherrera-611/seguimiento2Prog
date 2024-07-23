package ejercicio14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el género de la persona (M para masculino, F para femenino):");
        String genero = scanner.nextLine().toUpperCase();

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();

        int ayudaMensual = CalculoAyudaAlcaldia.calcularAyuda(genero, edad);

        if (ayudaMensual > 0) {
            System.out.println("El valor recibido mensualmente por ayuda de la alcaldía es: $" + ayudaMensual);
        } else {
            System.out.println("No corresponde recibir ayuda según los criterios ingresados.");
        }

        scanner.close();
    }
}

