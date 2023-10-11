package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
  * 1.Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, 
  * de tal forma que en el fichero resultante aparezcan las líneas de los primeros
  *  dos ficheros mezcladas, es decir, la primera línea será del primer fichero, 
  *  la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.

  Los nombres de los dos ficheros origen y el nombre del fichero destino se deben
   pasarse por texto o bien emplear JFileChooser
  Hay que tener en cuenta que los ficheros dedonde se van 
  cogiendo las líneas pueden tener tamaños diferentes en cuanto al número de líneas.


 2.Realiza un programa en Java donde introduzcas la ruta de un fichero por teclado 
 y un texto que queramos a escribir en el fichero con JOptionPane.showInputDialog
  Posteriormente, muestra el contenido del fichero.

 Haz una versión alternativa empleando JFileChooser

 3.Crea un programa en Java que lea el contenido de un archivo de que indique 
 el usuario y reemplace todas las ocurrencias de una
 palabra por otra. Ambas palabras serán solicitadas al usuario.
 El resultado debe guardarse en otro archivo de texto llamado "reemplazo.txt"
  */



public class Ejercicio2 {
	public static String inputString(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();
	}

	public static void createFile(String fileName) {
		boolean creado = false;
		while (!creado) {
			File file = new File(fileName);
			try {
				if (!file.exists()) {
					file.createNewFile();
					creado = true;
					System.out.println("Archivo creado");

				} else {
					System.out.println("El archivo ya existe");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void main(String[] args) {

		String uno = "uno.txt";
		String dos = "dos.txt";
		String ambos = "ambos.txt";

		try (
			BufferedReader br = new BufferedReader(new FileReader(uno))) {
			String line;
			while ((line = br.readLine()) != null) {
				
				System.out.println(line); // Print the line to the console as an example
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
