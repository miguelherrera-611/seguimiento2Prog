package ejercicio17;

public class CostoImpresion {

    public static void calcularCostoImpresion(int cantidadCopias) {
        double precioPorCopia;

        if (cantidadCopias >= 0 && cantidadCopias <= 499) {
            precioPorCopia = 120;
        } else if (cantidadCopias >= 500 && cantidadCopias <= 749) {
            precioPorCopia = 100;
        } else if (cantidadCopias >= 750 && cantidadCopias <= 999) {
            precioPorCopia = 80;
        } else if (cantidadCopias >= 1000) {
            precioPorCopia = 50;
        } else {
            System.out.println("Cantidad de copias no válida.");
            return;
        }

        double precioTotal = cantidadCopias * precioPorCopia;

        System.out.println("Precio por copia: $" + precioPorCopia);
        System.out.println("Precio total: $" + precioTotal);
    }
}

