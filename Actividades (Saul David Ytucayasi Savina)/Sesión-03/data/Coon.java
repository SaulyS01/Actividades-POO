package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Coon {
    public static Connection connectSQLite() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            String dbURL = "jdbc:sqlite:contactos.bd?foreign_keys=on;";
            conn = DriverManager.getConnection(dbURL);
            System.out.println("Okey en la conexion");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error en la conexion" + e);
        }
        return conn;
    }
}
