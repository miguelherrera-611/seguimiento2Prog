package ejercicio22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Juego juego = new Juego();

        System.out.println("Bienvenido al juego de 21 contra la computadora!\n");

        juego.jugar(scanner);

        scanner.close();
    }
}

