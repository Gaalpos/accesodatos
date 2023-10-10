package FicherosBinarios;

import java.io.*;

public class Ficheros {

	final static String File_Name = "fichero.dat";

	public static void createFile() {

		FileOutputStream fos = null;
		DataOutputStream dos = null;
		File fichero = new File(File_Name);

		int[] numeros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		try {
			if (!fichero.exists()) {
				System.out.println("Fichero creado");
				fichero.createNewFile();
			} else {
				System.out.println("ya exsite");
			}
			fos = new FileOutputStream(fichero, true);
			dos = new DataOutputStream(fos);

			for (int numero : numeros) {
				dos.writeInt(numero);
			}
		} catch (IOException e) {
			System.out.println("No se pudo abrir el fichero");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("No se pudo escribir en el fichero");
		} finally {
			try {
				dos.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public static void readfile() {

		FileInputStream fis = null;
		DataInputStream dis = null;
		double num;

		try {
			fis = new FileInputStream(File_Name);
			dis = new DataInputStream(fis);

			// while (true)  ES POCO RECOMENDABLE, mejor usar available()
			while (dis.available() != 0) {
				System.out.println("Num" + dis.readInt());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No encontrado");
		} catch (IOException ioe) {
			System.out.println("No se ha podido leer la información del fichero ");
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e) {
				System.out.println("no se ha podido cerrar el flujo");
			}
		}
	}

	public static void main(String[] args) {
		createFile();
		readfile();
	}
}
