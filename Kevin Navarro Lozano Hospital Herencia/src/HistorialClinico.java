

public final class HistorialClinico {

    private String codigo;
    private String fecha;
    private String idPaciente;
    private String idMedico;
    private String observaciones;

    public HistorialClinico(String codigo, String fecha, String idPaciente,
                            String idMedico, String observaciones) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.idPaciente = idPaciente;
        this.idMedico = idMedico;
        this.observaciones = observaciones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(String idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(String idMedico) {
        this.idMedico = idMedico;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public void mostrar() {
        System.out.println("\n\t---------------");
        System.out.println("Codigo Historial: " + codigo);
        System.out.println("Fecha: " + fecha);
        System.out.println("ID Pacielnte: " + idPaciente);
        System.out.println("ID Medico: " + idMedico);
        System.out.println("Observaciones:\n" + observaciones);
        System.out.println("\t---------------");
    }
}