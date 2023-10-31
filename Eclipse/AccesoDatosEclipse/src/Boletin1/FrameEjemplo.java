package Boletin1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrameEjemplo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameEjemplo frame = new FrameEjemplo();
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
	public FrameEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BtnSaludar = new JButton("Saludar");
		BtnSaludar.setName("saludar");
		BtnSaludar.setToolTipText("Rapidito que toca Coñecemento do Medio");
		BtnSaludar.addActionListener(new ManejadorBotones());
		BtnSaludar.setBounds(79, 130, 89, 23);
		contentPane.add(BtnSaludar);
		
		textField = new JTextField();
		textField.setBounds(168, 49, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton BtnInsultar = new JButton("Insultar");
		BtnInsultar.setName("insultar");
		BtnInsultar.setToolTipText("Dalle Carallo, ten ovos!!");
		BtnInsultar.addActionListener(new ManejadorBotones());
		BtnInsultar.setBounds(250, 130, 89, 23);
		contentPane.add(BtnInsultar);
		
		JLabel lblNewLabel = new JLabel("Nombre: ");
		lblNewLabel.setBounds(88, 52, 80, 14);
		contentPane.add(lblNewLabel);
	}
}
