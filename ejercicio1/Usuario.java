package ejercicio1;

public class Usuario {
    private String usuarioBase;
    private String claveBase;
    private boolean estadoSistema;

    public Usuario(String usuarioBase, String claveBase, boolean estadoSistema) {
        this.usuarioBase = usuarioBase;
        this.claveBase = claveBase;
        this.estadoSistema = estadoSistema;
    }

    public boolean validarEstado() {
        return estadoSistema;
    }

    public boolean permitirAcceso(String usuarioIngresado, String claveIngresada) {
        if (usuarioIngresado.equals(usuarioBase) && claveIngresada.equals(claveBase) && validarEstado()) {
            return true;
        } else {
            return false;
        }
    }

    public String getUsuarioBase() {
        return usuarioBase;
    }

    public void setUsuarioBase(String usuarioBase) {
        this.usuarioBase = usuarioBase;
    }

    public String getClaveBase() {
        return claveBase;
    }

    public void setClaveBase(String claveBase) {
        this.claveBase = claveBase;
    }

    public boolean EstadoSistema() {
        return estadoSistema;
    }

    public void setEstadoSistema(boolean estadoSistema) {
        this.estadoSistema = estadoSistema;
    }
}
