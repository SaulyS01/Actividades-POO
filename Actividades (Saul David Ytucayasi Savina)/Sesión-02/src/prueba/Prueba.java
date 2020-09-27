package src.prueba;
    
public class Prueba {
    String nombre;
    int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNomString() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String comer() {
        return "Hola";
    }
}

