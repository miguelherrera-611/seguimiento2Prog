package ejercicio14;

import java.util.Scanner;

public class CalculoAyudaAlcaldia {

    public static int calcularAyuda(String genero, int edad) {
        int ayudaMensual = 0;

        if (genero.equalsIgnoreCase("F")) { // Si el género es femenino
            if (edad > 50) {
                ayudaMensual = 120000;
            } else if (edad >= 30 && edad <= 50) {
                ayudaMensual = 100000;
            }
        } else if (genero.equalsIgnoreCase("M")) { // Si el género es masculino
            ayudaMensual = 40000;
        }

        return ayudaMensual;
    }
}
