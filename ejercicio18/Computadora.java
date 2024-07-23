package ejercicio18;

public class Computadora {

    private boolean emitePitido;
    private boolean discoDuroGira;

    public Computadora(boolean emitePitido, boolean discoDuroGira) {
        this.emitePitido = emitePitido;
        this.discoDuroGira = discoDuroGira;
    }

    public void determinarEstado() {
        if (emitePitido && discoDuroGira) {
            System.out.println("La computadora está averiada. Póngase en contacto con el técnico de soporte.");
        } else if (emitePitido && !discoDuroGira) {
            System.out.println("Verificar contactos de la unidad.");
        } else if (!emitePitido && !discoDuroGira) {
            System.out.println("Traiga la computadora para repararla en la central.");
        } else if (!emitePitido && discoDuroGira) {
            System.out.println("Compruebe las conexiones de altavoces.");
        }
    }
}

