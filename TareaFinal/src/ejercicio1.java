
import java.awt.EventQueue;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.io.BufferedReader;

import java.io.File;

import java.io.FileReader;


import javax.swing.JButton;

import javax.swing.JFileChooser;

import javax.swing.JFrame;

import javax.swing.JOptionPane;

import javax.swing.JPanel;

import javax.swing.JTextArea;

import javax.swing.border.EmptyBorder;

import javax.swing.JScrollPane;


public class ejercicio1 extends JFrame {


	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	private JTextArea textArea;


	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {

			public void run() {

				try {

					MostrarFichero frame = new MostrarFichero();

					frame.setVisible(true);

				} catch (Exception e) {

					e.printStackTrace();

				}

			}

		});

	}


	public MostrarFichero() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 450, 300);

		contentPane = new JPanel();

		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));


		setContentPane(contentPane);

		contentPane.setLayout(null);


		JButton btnNewButton = new JButton("Escoje Archivo a Mostrar");

		btnNewButton.setBounds(115, 223, 185, 21);

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				mostrarContenidoArchivo();

			}

		});

		contentPane.add(btnNewButton);


		JScrollPane scrollPane = new JScrollPane();

		scrollPane.setBounds(28, 10, 351, 203);

		contentPane.add(scrollPane);


		textArea = new JTextArea();

		scrollPane.setViewportView(textArea);

		textArea.setLineWrap(true);

		textArea.setWrapStyleWord(true);

	}


	private void mostrarContenidoArchivo() {

		JFileChooser fileChooser = new JFileChooser();

		int result = fileChooser.showOpenDialog(this);


		if (result == JFileChooser.APPROVE_OPTION) {

			File selectedFile = fileChooser.getSelectedFile();

			String filePath = selectedFile.getAbsolutePath();


			// Muestra la ruta del archivo en un JOptionPane

			JOptionPane.showMessageDialog(this, "Ruta del archivo: " + filePath);


			// Lee el contenido del archivo y lo muestra en el JTextArea

			try (BufferedReader reader = new BufferedReader(new FileReader(selectedFile))) {

				StringBuilder content = new StringBuilder();

				String line;

				while ((line = reader.readLine()) != null) {

					content.append(line).append("\n");

				}

				textArea.setText(content.toString());

			} catch (Exception ex) {

				ex.printStackTrace();

				JOptionPane.showMessageDialog(this, "Error al leer el archivo", "Error", JOptionPane.ERROR_MESSAGE);

			}

		}

	}

}