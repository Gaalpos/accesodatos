package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Codificar un programa en Java que muestre un menú con 3 opciones:
 En la primera deberá crear un fichero (con el nombre que se quiera) en el que
indicaremos en líneas diferentes tu nombre, tus apellidos, tu ciudad de nacimiento.

 En la segunda opción deberá mostrar por pantalla el contenido del fichero creado.

 En la tercera opción crearemos un fichero cuyo nombre y contenido introducimos por
teclado. Después de crear el fichero con la información introducida, se deberá mostrar
por pantalla el texto del fichero variando entre mayúsculas y minúsculas. 
Por ejemplo, si
escribo Bienvenidos a Vigo deberá mostrar bIENVENIDOS A vIGO.
 */
public class Ejercicio1 {

	public static String inputString(String message) {
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		return sc.nextLine();
	}

	public static void menu() {
		System.out.println("1. Crear fichero");
		System.out.println("2. Mostrar contenido del fichero");
		System.out.println("3. Alternar letras");
		System.out.println("4. Salir");
	}

	public static String createFile() {
		boolean creado = false;
		String fileName = inputString("Nombre del archivo");
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
		return fileName;
	}

	public static String insertInfo() {
		String file = createFile();
		try {
			FileWriter fw = new FileWriter(file, true);

			String name = inputString("Nombre: ");
			String surname = inputString("Apellidos: ");
			String city = inputString("Lugar nacimiento: ");
			fw.write(name + "\n" + surname + "\n" + city);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return file;
	}

	public static void showInfo() {
		String file = inputString("nombre del fichero");

		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String linea;
			try {
				while ((linea = br.readLine()) != null) {
					System.out.println(linea);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		createFile();
		showInfo();

	}
}
