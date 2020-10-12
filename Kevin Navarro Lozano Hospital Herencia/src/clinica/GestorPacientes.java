package clinica;

import java.util.ArrayList;
import java.util.Scanner;

public final class GestorPacientes {

    private ArrayList<Paciente> pacientes;
    private Scanner teclado;

    public GestorPacientes() {
        pacientes = new ArrayList<Paciente>();
        teclado = new Scanner(System.in);
    }

    public boolean nuevoPaciente() {
        System.out.println("\n\tALTA NUEVO PACIENTE");
        System.out.print("Introduzca Identificador: ");
        String id = teclado.nextLine();
        System.out.print("Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Apellidos: ");
        String apellidos = teclado.nextLine();
        System.out.print("Genero: ");
        String genero = teclado.nextLine();
        System.out.print("Edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();//Tras leer un int, conviene "limpiar" el stream de entrada, para evitar problemas al querer leer luego datos String
        Paciente nuevoPaciente = new Paciente(id, nombre, apellidos, edad, genero);
        return pacientes.add(nuevoPaciente);//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
    }

    public void mostrarPacientes() {
        for (Paciente p: pacientes)
            p.mostrar();
    }

    public void modificarPaciente() {
    }
}