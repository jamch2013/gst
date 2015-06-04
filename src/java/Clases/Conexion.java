package Clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn;

    static com.mysql.jdbc.Connection getInstance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private Conexion() {
    }

    private static void conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gst", "root", "spst2012"); 
        } catch (SQLException e) {  
          System.out.println("Error de MySQL: " + e.getMessage()); 
        }  catch (ClassNotFoundException e) {
          System.out.println("Error inesperado: " + e.getMessage());
        }
    }

    public static Connection getInstace() {
        if (conn == null) {
            conectar();
        }
        return conn;
    }
}
