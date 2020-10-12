package clinica;

public final class Main {

    static GestorPacientes pacientes = new GestorPacientes();

    public static void main(String[] args) {

        pacientes.nuevoPaciente();
        pacientes.nuevoPaciente();
        pacientes.mostrarPacientes();
        pacientes.modificarPaciente();
        pacientes.mostrarPacientes();
        pacientes.mostrarPacientes();

    }

}