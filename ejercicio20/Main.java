package ejercicio20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OperadorTelefonico tigo = new OperadorTelefonico("Tigo", 45000, 200, 12000);
        OperadorTelefonico claro = new OperadorTelefonico("Claro", 30000, 100, 18000);
        OperadorTelefonico movistar = new OperadorTelefonico("Movistar", 40000, 250, 8000);

        System.out.println("Bienvenido a CeluMovil - Promoción febrero 2023");
        System.out.println("Elija su operador: ");
        System.out.println("1. Tigo");
        System.out.println("2. Claro");
        System.out.println("3. Movistar");
        System.out.print("Ingrese el número correspondiente al operador: ");
        int opcion = scanner.nextInt();

        OperadorTelefonico operadorSeleccionado = null;
        switch (opcion) {
            case 1:
                operadorSeleccionado = tigo;
                break;
            case 2:
                operadorSeleccionado = claro;
                break;
            case 3:
                operadorSeleccionado = movistar;
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.print("Ingrese la cantidad de minutos internacionales consumidos: ");
        int minutosInternacionales = scanner.nextInt();

        int costoLlamadasInternacionales = minutosInternacionales * operadorSeleccionado.getValorMinutoInternacional();
        int costoTotal = operadorSeleccionado.getCargoFijo() + costoLlamadasInternacionales + operadorSeleccionado.getValorPaqueteDatos();

        System.out.println("Resumen de la factura:");
        System.out.println("Operador: " + operadorSeleccionado.getNombre());
        System.out.println("Cargo fijo: $" + operadorSeleccionado.getCargoFijo());
        System.out.println("Costo por minutos internacionales: $" + costoLlamadasInternacionales);
        System.out.println("Costo paquete de datos: $" + operadorSeleccionado.getValorPaqueteDatos());
        System.out.println("Costo total: $" + costoTotal);

        scanner.close();
    }
}

