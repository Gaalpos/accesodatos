package vista;


import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controlador.Coordinador;
import modelo.Productos;
import modelo.ProductosId;

public class FormProducto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFieldIdProd;
	private JTextField txtFieldDescrip;
	private JTextField txtFieldPrecCompra;
	private JTextField txtFieldExistencias;
	private JTextField txtFieldIdProv;
	private Coordinador miCoordinador;

	public Coordinador getMiCoordinador() {
		return miCoordinador;
	}

	public void setMiCoordinador(Coordinador miCoordinador) {
		this.miCoordinador = miCoordinador;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormProducto frame = new FormProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormProducto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Id Producto");
		lblNewLabel.setBounds(23, 63, 85, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombre = new JLabel("Descripción");
		lblNombre.setBounds(23, 91, 85, 16);
		contentPane.add(lblNombre);
		
		JLabel lblPrecioCompra = new JLabel("Precio Compra");
		lblPrecioCompra.setBounds(23, 134, 91, 16);
		contentPane.add(lblPrecioCompra);
		
		JLabel lblExistencias = new JLabel("Existencias");
		lblExistencias.setBounds(23, 172, 91, 16);
		contentPane.add(lblExistencias);
		
		JLabel lblIdProveedor = new JLabel("Id Proveedor");
		lblIdProveedor.setBounds(23, 210, 91, 16);
		contentPane.add(lblIdProveedor);
		
		txtFieldIdProd = new JTextField();
		txtFieldIdProd.setBounds(138, 58, 130, 26);
		contentPane.add(txtFieldIdProd);
		txtFieldIdProd.setColumns(10);
		
		txtFieldDescrip = new JTextField();
		txtFieldDescrip.setBounds(138, 91, 130, 26);
		txtFieldDescrip.setColumns(10);
		contentPane.add(txtFieldDescrip);
		
		txtFieldPrecCompra = new JTextField();
		txtFieldPrecCompra.setBounds(138, 129, 130, 26);
		txtFieldPrecCompra.setColumns(10);
		contentPane.add(txtFieldPrecCompra);
		
		txtFieldExistencias = new JTextField();
		txtFieldExistencias.setBounds(138, 167, 130, 26);
		txtFieldExistencias.setColumns(10);
		contentPane.add(txtFieldExistencias);
		
		txtFieldIdProv = new JTextField();
		txtFieldIdProv.setBounds(138, 205, 130, 26);
		txtFieldIdProv.setColumns(10);
		contentPane.add(txtFieldIdProv);
		
		JButton btnNewButton = new JButton("Crear Producto");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			 Productos p = new Productos();
			 ProductosId id = new ProductosId();
			 id.setIdProducto(txtFieldIdProd.getText());
			 id.setIdFabricante(txtFieldIdProv.getText());
			 
			 p.setId(id);
			 p.setExistencias(Integer.parseInt(txtFieldExistencias.getText()));
			 p.setPrecioCompra(Double.parseDouble(txtFieldPrecCompra.getText()));
			 p.setDescripcion(txtFieldDescrip.getText());
			 miCoordinador.registrarProducto(p);
			 
			}
		});
		btnNewButton.setBounds(308, 205, 117, 29);
		contentPane.add(btnNewButton);
	}
}
