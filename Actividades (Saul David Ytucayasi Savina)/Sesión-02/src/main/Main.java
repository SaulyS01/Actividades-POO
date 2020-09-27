package src.main;

import src.productos.Producto;
import src.usuarios.Estudiante;
import src.usuarios.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("nulo", "nulo", "nulo", 0, 0);
        Producto producto = new Producto("nulo", "nulo", "nulo");
        Estudiante estudiante = new Estudiante("nulo", "nulo", "Ninguno", 0, "nulo", 0, 0);

        usuario.setNombre("Saul");
        usuario.setApellidos("Ytucayasi Savina");
        usuario.setGenero("M");
        usuario.setEdad(17);
        usuario.setId(150);

        estudiante.setNombre("Saul");
        estudiante.setApellidos("Ytucayasi Savina");
        estudiante.setGenero("M");
        estudiante.setEdad(17);
        estudiante.setId(150);
        estudiante.setLugarEstudio("UpeU");
        estudiante.setCicloEstudio(2);

        producto.setPolo("UpeU");
        producto.setCasaca("UpeU");
        producto.setGorro("UpeU");

        System.out.println(usuario.agregar());
        System.out.println(estudiante.agregar());
        System.out.println(producto.agregar());
    }
}