package ejercicio5;

public class AreaRectangulo {
    private double base;
    private double altura;

    public AreaRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public boolean validarDatosIngresados() {
        return base > 0 && altura > 0;
    }

    public double calcularArea() {
        return base * altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

