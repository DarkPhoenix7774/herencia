package clinica;

final class Paciente {

    private String id;
    private String nombre;
    private String apellidos;
    private int edad;
    private String genero;

    public Paciente(String id, String nombre, String apellidos, int edad, String genero) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.genero = genero;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * Muestra por consola todos los datos del Paciente
     */
    public void mostrar() {
        System.out.println("\n\t---------------");
        System.out.println("ID Paciente: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Genero: " + genero);
        System.out.println("\t---------------");
    }
}
