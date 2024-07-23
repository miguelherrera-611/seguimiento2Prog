package ejercicio4;

public class PagoEmpleado {
    private int codEmpleado;
    private double salarioBasico;
    private double horasExtras;
    private int numeroHoras;
    private double descuento;
    private double descuentoPrestamo;
    private double bonificacion;
    private double neto;

    public PagoEmpleado(int codEmpleado, double salarioBasico, double horasExtras, int numeroHoras, double descuento, double descuentoPrestamo, double bonificacion, double neto) {
        this.codEmpleado = codEmpleado;
        this.salarioBasico = salarioBasico;
        this.horasExtras = horasExtras;
        this.numeroHoras = numeroHoras;
        this.descuento = descuento;
        this.descuentoPrestamo = descuentoPrestamo;
        this.bonificacion = bonificacion;
        this.neto = neto;
    }

    public double calcularValorHE() {
        double valorHoraExtra = 20.0; // Ejemplo, el valor puede variar
        return horasExtras * valorHoraExtra;
    }

    public double calcularValorDevengado() {
        return salarioBasico + calcularValorHE();
    }

    public double calcularValorDEducido() {
        double valorDevengado = calcularValorDevengado();
        return valorDevengado - descuento - descuentoPrestamo;
    }

    public double calcularNeto() {
        double valorDevengadoDescontado = calcularValorDEducido();
        return valorDevengadoDescontado + bonificacion;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public double getSalarioBasico() {
        return salarioBasico;
    }

    public void setSalarioBasico(double salarioBasico) {
        this.salarioBasico = salarioBasico;
    }

    public double getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(double horasExtras) {
        this.horasExtras = horasExtras;
    }

    public int getNumeroHoras() {
        return numeroHoras;
    }

    public void setNumeroHoras(int numeroHoras) {
        this.numeroHoras = numeroHoras;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getDescuentoPrestamo() {
        return descuentoPrestamo;
    }

    public void setDescuentoPrestamo(double descuentoPrestamo) {
        this.descuentoPrestamo = descuentoPrestamo;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getNeto() {
        return neto;
    }

    public void setNeto(double neto) {
        this.neto = neto;
    }
}
