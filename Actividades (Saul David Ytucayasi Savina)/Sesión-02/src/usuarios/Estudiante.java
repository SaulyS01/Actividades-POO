package src.usuarios;

public class Estudiante extends Usuario {
    
    private String lugarEstudio;
    private int cicloEstudio;

    public Estudiante(String nombre, String apellidos, String lugarEstudio, int cicloEstudio, String genero, int id, int edad) {
        super(nombre, apellidos, genero, id, edad);
        this.lugarEstudio = lugarEstudio;
        this.cicloEstudio = cicloEstudio;
    }

    public void setLugarEstudio(String lugarEstudio) {
        this.lugarEstudio = lugarEstudio;
    }

    public String getLugarEstudio() {
        return lugarEstudio;
    }

    public void setCicloEstudio(int cicloEstudio) {
        this.cicloEstudio = cicloEstudio;
    }

    public int getCicloEstudio() {
        return cicloEstudio;
    }

    public String agregar() {
        return "El nombre es: " + getNombre() + "\n" +
        "El apellido es: " + getApellidos() + "\n" + 
        "El genero es: " + getNombre() + "\n" + 
        "El id es: " + getId() + "\n" + 
        "La edad es: " + getEdad() + "\n" + 
        "El lugar de estudio es: " + getLugarEstudio() + "\n" +
        "El ciclo que cursa es: " + getCicloEstudio() + "\n";
    }
}
