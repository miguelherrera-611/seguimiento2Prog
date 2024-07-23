package ejercicio12;

import java.util.Scanner;

public class CalificacionMaterias {

    public static double calcularPromedio(double[] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    public static String determinarCalificacion(double promedio) {
        if (promedio >= 0 && promedio < 6) {
            return "Mala";
        } else if (promedio >= 6 && promedio <= 8) {
            return "Buena";
        } else if (promedio > 8 && promedio <= 10) {
            return "Excelente";
        } else {
            return "Promedio fuera de rango";
        }
    }
}


