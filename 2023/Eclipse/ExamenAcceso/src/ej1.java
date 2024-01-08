
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class ej1 extends JFrame {
    private JTable productTable;
    private JButton showButton;
    private conexion dbConn;

    public ProductFrame(conexion dbConn) {
        this.dbConn = dbConn;

        // Inicializar la tabla y el botón
        productTable = new JTable();
        showButton = new JButton("Show Products");

        // Agregar un ActionListener al botón para mostrar los datos
        showButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Statement stmt = dbConn.getConnection().createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT ProductName FROM Products");

                    // Crear un modelo de tabla y agregar los datos del ResultSet
                    DefaultTableModel model = new DefaultTableModel(new String[]{"Product Name"}, 0);
                    while (rs.next()) {
                        String productName = rs.getString("ProductName");
                        model.addRow(new Object[]{productName});
                    }

                    // Establecer el modelo en la tabla
                    productTable.setModel(model);

                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        });

        // Agregar la tabla y el botón al JFrame
        add(new JScrollPane(productTable), BorderLayout.CENTER);
        add(showButton, BorderLayout.SOUTH);

        // Configurar el JFrame
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}