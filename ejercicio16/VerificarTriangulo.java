package ejercicio16;

import java.util.Scanner;

public class VerificarTriangulo {

    public static boolean esTrianguloValido(int angulo1, int angulo2, int angulo3) {
        return (angulo1 + angulo2 + angulo3 == 180);
    }
}
