
import java.sql.*;

public class DBConnection {
    private Connection conn;

    public DBConnection(String server, String database, String user, String password) {
        try {
            // Ensure the JDBC driver is loaded
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection
            conn = DriverManager.getConnection("jdbc:mysql://" + server + "/" + database, user, password);
        } catch (SQLException e) {
            System.out.println("Error al conectar con la base de datos: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("No se encontró el driver JDBC: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return conn;
    }
}