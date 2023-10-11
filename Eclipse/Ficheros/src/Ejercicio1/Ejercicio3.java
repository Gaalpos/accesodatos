package Ejercicio1;

import java.io.*;
import javax.swing.JOptionPane;

public class Ejercicio3 {

	public static void escribe(String archivo, String texto) {
		try (BufferedWriter escribe = new BufferedWriter(new FileWriter(archivo))) {
			escribe.write(texto);
			System.out.println("Texto escrito");
		} catch (IOException e) {
			System.out.println("Error al escribir en el fichero: " + e.getMessage());
		}
	}

	public static void lee(String archivo) {

		try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
			StringBuilder contenido = new StringBuilder();
			String line;
			while ((line = lector.readLine()) != null) {
				contenido.append(line).append("\n");
			}
			System.out.println("Contenido del fichero: " + contenido.toString());
		} catch (IOException e) {
			System.out.println("Error al leer el fichero: " + e.getMessage());
		}
	}

	public static void main(String[] args) {

		String archivo = JOptionPane.showInputDialog("Ruta del fichero:");
		String texto = JOptionPane.showInputDialog("Texto a escribir:");

		escribe(archivo, texto);
		lee(archivo);

	}
}
