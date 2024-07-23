package ejercicio7;

public class Reclamo {
    private int numeroReclamo;
    private String nombrePersona;
    private String asunto;
    private String descripcionReclamo;
    private String estadoReclamo;

    public Reclamo(int numeroReclamo, String nombrePersona, String asunto, String descripcionReclamo, String estadoReclamo) {
        this.numeroReclamo = numeroReclamo;
        this.nombrePersona = nombrePersona;
        this.asunto = asunto;
        this.descripcionReclamo = descripcionReclamo;
        this.estadoReclamo = estadoReclamo;
    }

    public boolean validarEstadoReclamo() {
        return estadoReclamo.equalsIgnoreCase("pendiente") || estadoReclamo.equalsIgnoreCase("en proceso");
    }

    public void mensajeRecepcionReclamo() {
        System.out.println("Reclamo #" + numeroReclamo + " recibido. Asunto: " + asunto);
    }

    public int getNumeroReclamo() {
        return numeroReclamo;
    }

    public void setNumeroReclamo(int numeroReclamo) {
        this.numeroReclamo = numeroReclamo;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcionReclamo() {
        return descripcionReclamo;
    }

    public void setDescripcionReclamo(String descripcionReclamo) {
        this.descripcionReclamo = descripcionReclamo;
    }

    public String getEstadoReclamo() {
        return estadoReclamo;
    }

    public void setEstadoReclamo(String estadoReclamo) {
        this.estadoReclamo = estadoReclamo;
    }
}
