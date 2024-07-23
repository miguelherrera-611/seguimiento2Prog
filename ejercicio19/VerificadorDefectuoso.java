package ejercicio19;

public class VerificadorDefectuoso {

    private static final int[] modelosDefectuosos = {119, 179, 189, 190, 191, 192, 193, 194, 195, 221, 780};

    public static boolean verificarDefecto(int numeroModelo) {
        for (int modelo : modelosDefectuosos) {
            if (numeroModelo == modelo) {
                return true;
            }
        }
        return false;
    }
}
