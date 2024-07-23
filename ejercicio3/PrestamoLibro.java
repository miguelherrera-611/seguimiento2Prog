package ejercicio3;

public class PrestamoLibro {
    private int codPrestamo;
    private String fechaPrestamo;
    private String nombreLibro;
    private String codigoUsuario;
    private int diasDePrestamo;
    private String estadoPrestamo;

    public PrestamoLibro(int codPrestamo, String fechaPrestamo, String nombreLibro, String codigoUsuario, int diasDePrestamo, String estadoPrestamo) {
        this.codPrestamo = codPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.nombreLibro = nombreLibro;
        this.codigoUsuario = codigoUsuario;
        this.diasDePrestamo = diasDePrestamo;
        this.estadoPrestamo = estadoPrestamo;
    }

    public void consultarEstadoPrestamo() {
        System.out.println("Estado del préstamo #" + codPrestamo + ": " + estadoPrestamo);
    }

    public void consultarDatosPrestamo() {
        System.out.println("Datos del préstamo #" + codPrestamo);
        System.out.println("Fecha de préstamo: " + fechaPrestamo);
        System.out.println("Nombre del libro: " + nombreLibro);
        System.out.println("Código de usuario: " + codigoUsuario);
        System.out.println("Días de préstamo: " + diasDePrestamo);
        System.out.println("Estado del préstamo: " + estadoPrestamo);
    }

    public int getCodPrestamo() {
        return codPrestamo;
    }

    public void setCodPrestamo(int codPrestamo) {
        this.codPrestamo = codPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public String getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(String codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public int getDiasDePrestamo() {
        return diasDePrestamo;
    }

    public void setDiasDePrestamo(int diasDePrestamo) {
        this.diasDePrestamo = diasDePrestamo;
    }

    public String getEstadoPrestamo() {
        return estadoPrestamo;
    }

    public void setEstadoPrestamo(String estadoPrestamo) {
        this.estadoPrestamo = estadoPrestamo;
    }
}
