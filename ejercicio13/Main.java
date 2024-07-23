package ejercicio13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer número:");
        double numero3 = scanner.nextDouble();

        double mayor = MayorDeTresNumeros.encontrarMayor(numero1, numero2, numero3);

        System.out.println("El número mayor es: " + mayor);

        scanner.close();
    }
}
