package ejercicio18;

public class Main {

    public static void main(String[] args) {
        Computadora computadora1 = new Computadora(true, true);
        Computadora computadora2 = new Computadora(true, false);
        Computadora computadora3 = new Computadora(false, false);
        Computadora computadora4 = new Computadora(false, true);

        System.out.println("Computadora 1:");
        computadora1.determinarEstado();

        System.out.println("Computadora 2:");
        computadora2.determinarEstado();

        System.out.println("Computadora 3:");
        computadora3.determinarEstado();

        System.out.println("Computadora 4:");
        computadora4.determinarEstado();
    }
}
