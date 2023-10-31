package Boletin1;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField Lado1;
	private JTextField Lado2;
	private JTextField Lado3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar el lado 1");
		lblNewLabel.setBounds(52, 32, 84, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblIngresarElLado = new JLabel("Ingresar el lado 2");
		lblIngresarElLado.setBounds(52, 74, 84, 14);
		contentPane.add(lblIngresarElLado);
		
		JLabel lblIngresarElLado_2 = new JLabel("Ingresar el lado 3");
		lblIngresarElLado_2.setBounds(52, 112, 84, 14);
		contentPane.add(lblIngresarElLado_2);
		
		Lado1 = new JTextField();
		Lado1.setBounds(169, 29, 86, 20);
		contentPane.add(Lado1);
		Lado1.setColumns(10);
		Lado1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char dato= e.getKeyChar();
				if(!Character.isDigit(dato)&& dato!='.') {
					e.consume();
				}
				
			}
		});
		
		Lado2 = new JTextField();
		Lado2.setColumns(10);
		Lado2.setBounds(169, 71, 86, 20);
		contentPane.add(Lado2);
		Lado2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char dato= e.getKeyChar();
				if(!Character.isDigit(dato)&& dato!='.') {
					e.consume();
				}
				
			}
		});
		
		Lado3 = new JTextField();
		Lado3.setColumns(10);
		Lado3.setBounds(169, 109, 86, 20);
		contentPane.add(Lado3);
		Lado3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char dato= e.getKeyChar();
				if(!Character.isDigit(dato)&& dato!='.') {
					e.consume();
				}
				
			}
		});
		
		JLabel Resultado = new JLabel("Área del triángulo: ");
		Resultado.setBounds(52, 182, 203, 14);
		contentPane.add(Resultado);
		;
		
		JButton Calcular = new JButton("Calcular");
		Calcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double uno= Double.parseDouble(Lado1.getText());
					double dos= Double.parseDouble(Lado2.getText());
					double tres= Double.parseDouble(Lado3.getText());
					double aux=(uno+dos+tres)/2;
					double area=aux*(aux-uno)*(aux-dos)*(aux-tres);
					Resultado.setText("Área del triangulo: "+Double.toString(area));
				} catch (NumberFormatException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		Calcular.setBounds(307, 23, 89, 23);
		contentPane.add(Calcular);
		
		JButton Reiniciar = new JButton("Reiniciar");
		Reiniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Lado1.setText("0");
				Lado2.setText("0");
				Lado3.setText("0");
				Resultado.setText("Área del triangulo: ");
			}
		});
		Reiniciar.setBounds(307, 131, 89, 23);
		contentPane.add(Reiniciar);
	}
}
