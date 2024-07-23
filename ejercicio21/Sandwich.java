package ejercicio21;

public class Sandwich {
    private String tamaño;
    private int costoBase;
    private boolean tocineta;
    private boolean jalapeño;
    private boolean pavo;
    private boolean queso;

    public Sandwich(String tamaño) {
        this.tamaño = tamaño;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            this.costoBase = 6000;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            this.costoBase = 12000;
        } else {
            System.out.println("Tamaño de sándwich no válido.");
        }
    }

    public void agregarTocineta() {
        this.tocineta = true;
    }

    public void agregarJalapeño() {
        this.jalapeño = true;
    }

    public void agregarPavo() {
        this.pavo = true;
    }

    public void agregarQueso() {
        this.queso = true;
    }

    public int calcularCosto() {
        int costoTotal = this.costoBase;

        if (tocineta) {
            costoTotal += 3000;
        }
        if (jalapeño) {
            // Jalapeño es gratis
        }
        if (pavo) {
            costoTotal += 3000;
        }
        if (queso) {
            costoTotal += 2500;
        }

        return costoTotal;
    }

    public String obtenerDescripcion() {
        StringBuilder descripcion = new StringBuilder();
        descripcion.append("Tamaño: ").append(tamaño).append("\n");
        descripcion.append("Ingredientes adicionales:\n");
        if (tocineta) {
            descripcion.append("- Tocineta ($3000)\n");
        }
        if (jalapeño) {
            descripcion.append("- Jalapeño (gratis)\n");
        }
        if (pavo) {
            descripcion.append("- Pavo ($3000)\n");
        }
        if (queso) {
            descripcion.append("- Queso ($2500)\n");
        }
        return descripcion.toString();
    }
}
