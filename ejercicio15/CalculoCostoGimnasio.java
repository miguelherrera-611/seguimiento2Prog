package ejercicio15;

import java.util.Scanner;

public class CalculoCostoGimnasio {

    public static int calcularCosto(int dias) {
        int costoMensualidad = 0;

        if (dias == 15) {
            costoMensualidad = 18000;
        } else if (dias == 30) {
            costoMensualidad = 35000;
        } else if (dias == 90) { // 3 meses
            costoMensualidad = 86000;
        }

        return costoMensualidad;
    }
}

