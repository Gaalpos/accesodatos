package Ejercicio2_1;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;

public class Productos extends JFrame {

	private static final String URL = "jdbc:mysql://localhost:3306/northwind";
	private static final String USUARIO = "root";
	private static final String PASSWORD = "";
	private JTable table;
	private JButton button;

	public Productos() {
		setTitle("Productos");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		button = new JButton("Cargar productos");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarProductos();
			}
		});

		table = new JTable();
		add(new JScrollPane(table), "Center");
		add(button, "South");
	}

	private void cargarProductos() {
		DefaultTableModel model = new DefaultTableModel(new String[] { "Nombre del producto" }, 0);

		try {
			Connection conexion  = DriverManager.getConnection(URL, USUARIO, PASSWORD);
			Statement statement = conexion.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT productName FROM products");
			while (resultSet.next()) {
				String nombre = resultSet.getString("productName");
				model.addRow(new Object[] { nombre });
			}
			table.setModel(model);
			resultSet.close();
			statement.close();
			conexion.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new Productos().setVisible(true);
			}
		});
	}
}