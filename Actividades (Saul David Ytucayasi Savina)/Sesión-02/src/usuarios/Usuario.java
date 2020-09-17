package src.usuarios;

public class Usuario {
    
    private String nombre;
    private String apellidos;
    private String genero;
    private int id;
    private int edad;

    public Usuario(String nombre, String apellidos, String genero, int id, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.genero = genero;
        this.id = id;
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public int getEdad() {
        return edad;
    }

    public String agregar() {
        return "El nombre es: " + getNombre() + "\n" +
        "El apellido es: " + getApellidos() + "\n" + 
        "El genero es: " + getNombre() + "\n" + 
        "El id es: " + getId() + "\n" + 
        "La edad es: " + getEdad() + "\n";
    }   
}