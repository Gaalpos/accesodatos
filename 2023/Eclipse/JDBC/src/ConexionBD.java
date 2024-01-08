


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/northwind";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USUARIO, PASSWORD);
            System.out.println("conexion establecida");
        } catch (SQLException e) {
            System.out.println("Error al conectarse: " + e.getMessage());
        }
        return connection;
    }
}