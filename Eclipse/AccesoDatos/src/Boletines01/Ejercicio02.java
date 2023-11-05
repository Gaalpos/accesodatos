package Boletines01;

import java.io.File;
import java.util.Scanner;

/*
 * Codificar un programa en Java que muestre un menú con 3 opciones:
 En la primera deberá crear un fichero (con el nombre que se quiera) en el que
indicaremos en líneas diferentes tu nombre, tus apellidos, tu ciudad de nacimiento.

 En la segunda opción deberá mostrar por pantalla el contenido del fichero creado.
 
En la tercera opción crearemos un fichero cuyo nombre y contenido introducimos por
teclado. Después de crear el fichero con la información introducida, se deberá mostrar
por pantalla el texto del fichero variando entre mayúsculas y minúsculas. Por ejemplo, si
escribo Bienvenidos a Vigo deberá mostrar bIENVENIDOS A vIGO.
 */

public class Ejercicio02 {
	
	
	public static void createFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombnre del archivo");
		
		String nameFile = sc.nextLine();
		File file = new File(nameFile);
		if(file.exists()) {
			System.out.println("el archivo ya existe");
		}else {
			try {
				file.createNewFile();
			} catch (Exception e) {
				System.out.println("Error");
			}
		}
	}
	public static void main(String[] args) {
		
		
		createFile();
		
	}
}
