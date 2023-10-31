package Boletin1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Ejercicio2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldRadio;
	private JTextField textFieldAltura;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Ingresar el radio");
		etiqueta1.setBounds(77, 60, 89, 14);
		contentPane.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Ingresar la altura");
		etiqueta2.setBounds(77, 109, 89, 14);
		contentPane.add(etiqueta2);
		
		JLabel resultado1 = new JLabel("El area es:");
		resultado1.setBounds(77, 157, 195, 14);
		contentPane.add(resultado1);
		
		JLabel resultado2 = new JLabel("El volumen es:");
		resultado2.setBounds(77, 202, 195, 14);
		contentPane.add(resultado2);
		
		textFieldRadio = new JTextField();
		textFieldRadio.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				System.out.println("Bienvenido");
			}
			@Override
			public void focusLost(FocusEvent e) {
				System.out.println("Adios");
			}
		});
		textFieldRadio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char dato= e.getKeyChar();
				if(!Character.isDigit(dato)&& dato!='.') {
					e.consume();
				}
				
			}
		});
		textFieldRadio.setBounds(186, 57, 86, 20);
		contentPane.add(textFieldRadio);
		textFieldRadio.setColumns(10);
		
		textFieldAltura = new JTextField();
		textFieldAltura.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char dato= e.getKeyChar();
				if(!Character.isDigit(dato)) {
					e.consume();
				}
				
			}
		});
		textFieldAltura.setText("");
		textFieldAltura.setBounds(186, 106, 86, 20);
		contentPane.add(textFieldAltura);
		textFieldAltura.setColumns(10);
		
		JButton botonCalcular = new JButton("Calcular");
		botonCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double radio= Double.parseDouble(textFieldRadio.getText());
					double altura= Double.parseDouble(textFieldAltura.getText());
					double volumen= Math.PI*Math.pow(radio, 2)*altura;
					double area= 2*Math.PI*radio*altura+2*Math.PI*Math.pow(radio, 2);
					resultado1.setText("Volumen: "+String.format("0.2f", area));
					resultado2.setText("Volumen: "+String.format("0.2f", volumen));
				} catch (NumberFormatException e1) {
					textFieldRadio.setText("");
					JOptionPane.showMessageDialog(null, "Debe ingresar un número válido");
				}
				
			}
		});
		botonCalcular.setBounds(354, 56, 89, 23);
		contentPane.add(botonCalcular);
		
		JButton botonReiniciar = new JButton("Reiniciar");
		botonReiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldAltura.setText("");
				textFieldRadio.setText("");
				resultado1.setText("El area es:");
				resultado2.setText("El volumen es:");

				
				
			}
		});
		botonReiniciar.setBounds(354, 105, 89, 23);
		contentPane.add(botonReiniciar);
	}
}
