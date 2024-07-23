package ejercicio2;

public class CitaMedica {
    private int codCita;
    private String fecha;
    private String hora;
    private String consultorio;
    private String nombreMedico;
    private String nombrePaciente;

    public CitaMedica(int codCita, String fecha, String hora, String consultorio, String nombreMedico, String nombrePaciente) {
        this.codCita = codCita;
        this.fecha = fecha;
        this.hora = hora;
        this.consultorio = consultorio;
        this.nombreMedico = nombreMedico;
        this.nombrePaciente = nombrePaciente;
    }

    public void crearCita() {
        System.out.println("Cita creada con éxito para el paciente " + nombrePaciente + " con el médico " + nombreMedico);
    }

    public void consultarDatosCita() {
        System.out.println("Cita médica #" + codCita);
        System.out.println("Fecha: " + fecha);
        System.out.println("Hora: " + hora);
        System.out.println("Consultorio: " + consultorio);
        System.out.println("Médico: " + nombreMedico);
        System.out.println("Paciente: " + nombrePaciente);
    }

    public void cambiarHora(String nuevaHora) {
        System.out.println("Hora de la cita modificada de " + hora + " a " + nuevaHora);
        this.hora = nuevaHora;
    }

    public int getCodCita() {
        return codCita;
    }

    public void setCodCita(int codCita) {
        this.codCita = codCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }
}
