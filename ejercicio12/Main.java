package ejercicio12;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            double[] calificaciones = new double[5];

            try {
                System.out.println("Ingrese las calificaciones de las cinco materias:");
                System.out.print("Física: ");
                calificaciones[0] = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Química: ");
                calificaciones[1] = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Biología: ");
                calificaciones[2] = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Matemáticas: ");
                calificaciones[3] = Double.parseDouble(scanner.nextLine().trim());

                System.out.print("Informática: ");
                calificaciones[4] = Double.parseDouble(scanner.nextLine().trim());

                double promedio = CalificacionMaterias.calcularPromedio(calificaciones);
                String calificacion = CalificacionMaterias.determinarCalificacion(promedio);

                System.out.println("El promedio de calificaciones es: " + promedio);
                System.out.println("La calificación obtenida es: " + calificacion);
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido para las calificaciones.");
            } finally {
                scanner.close();
            }
        }
    }