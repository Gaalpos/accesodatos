package vista;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

// ESTA CLASE NO PERTENECE AL PROYECTO, SOLO ESTÁ AQUÍ PARA REPRESENTAR LA FORMA EN LA QUE SE PUEDEN LISTAR LOS REGISTROS EN UN SCROLLABLE.

public class CustomerListFrame extends JFrame {
    private JTextArea textArea;

    public CustomerListFrame() {
        super("Lista de clientes");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        textArea = new JTextArea();
        textArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        JButton btnListCustomers = new JButton("Listar clientes");
        btnListCustomers.addActionListener(e -> listCustomers());

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(btnListCustomers, BorderLayout.NORTH);
        panel.add(scrollPane, BorderLayout.CENTER);

        add(panel);
    }

    private void listCustomers() {
        try {
            // Establecer conexión a la base de datos (Asegúrate de cambiar estos valores por los tuyos)
            String url = "jdbc:mysql://localhost:3306/sakila";
            String user = "root";
            String password = "";
            Connection conn = DriverManager.getConnection(url, user, password);

            // Consulta SQL para obtener todos los registros de la tabla customers
            String query = "SELECT * FROM customer";
            PreparedStatement statement = conn.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            // Limpiar el área de texto antes de agregar nuevos registros
            textArea.setText("");

            // Iterar a través de los resultados y agregarlos al área de texto
            while (resultSet.next()) {
                String customerInfo = resultSet.getString("customer_id") + "\n"
                        + resultSet.getString("first_name") + "\n"
                        + resultSet.getString("email") + "\n"
                        ;
                textArea.append(customerInfo);
            }

            // Cerrar la conexión y liberar recursos
            conn.close();
            statement.close();
            resultSet.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al listar clientes: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CustomerListFrame frame = new CustomerListFrame();
            frame.setVisible(true);
        });
    }
}
