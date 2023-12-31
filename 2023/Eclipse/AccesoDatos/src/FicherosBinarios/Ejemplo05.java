package FicherosBinarios;

import java.io.*;

//ejemplo que escribe numeros doubles en un fichero
//todos los números son reales
public class Ejemplo05 {

	public static void main(String[] args) {
//declaramos los objetos FileOutputStream y DataOutputStream

		FileOutputStream fe;
		DataOutputStream ds = null;
		try {
//array de enteros
			double[] array = { 5.25, 145.18, 2.37, 143.12, 147.10,

					169.19, 47.65 };

			fe = new FileOutputStream("Decimales.txt", false);
			ds = new DataOutputStream(fe);
//mientras el array tenga elementos los escribimos en el fichero

			for (double i : array) {
				ds.writeDouble(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se pudo abrir el fichero Enteros.txt");

		} catch (IOException e) {
			System.out.println("No se pudo escribir en el fichero Enteros.txt");
		} finally {
			try {
				ds.close();
			} catch (IOException e) {
//TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}