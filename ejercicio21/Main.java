package ejercicio21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a SandwichOrder");
        System.out.println("Elija el tamaño del sándwich:");
        System.out.println("1. Pequeño ($6000)");
        System.out.println("2. Grande ($12000)");
        System.out.print("Ingrese el número correspondiente al tamaño del sándwich: ");
        int opcionTamaño = scanner.nextInt();

        String tamaño = "";
        if (opcionTamaño == 1) {
            tamaño = "pequeño";
        } else if (opcionTamaño == 2) {
            tamaño = "grande";
        } else {
            System.out.println("Opción no válida.");
            scanner.close();
            return;
        }

        Sandwich sandwich = new Sandwich(tamaño);

        System.out.println("Ingredientes adicionales disponibles:");
        System.out.println("1. Tocineta ($3000)");
        System.out.println("2. Jalapeño (gratis)");
        System.out.println("3. Pavo ($3000)");
        System.out.println("4. Queso ($2500)");
        System.out.println("Ingrese los números correspondientes a los ingredientes que desea agregar (separados por espacios):");
        scanner.nextLine(); // Limpiar el buffer después del nextInt()
        String ingredientes = scanner.nextLine();
        String[] ingredientesSeleccionados = ingredientes.split(" ");

        for (String ingrediente : ingredientesSeleccionados) {
            switch (ingrediente) {
                case "1":
                    sandwich.agregarTocineta();
                    break;
                case "2":
                    sandwich.agregarJalapeño();
                    break;
                case "3":
                    sandwich.agregarPavo();
                    break;
                case "4":
                    sandwich.agregarQueso();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    scanner.close();
                    return;
            }
        }

        int costoTotal = sandwich.calcularCosto();
        System.out.println("Resumen del pedido:");
        System.out.println(sandwich.obtenerDescripcion());
        System.out.println("Costo total: $" + costoTotal);

        scanner.close();
    }
}

