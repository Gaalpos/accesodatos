package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Calculadora {

	public static void hacerCalculos(String fichEntrada, String fichSalida) throws IOException {

		Scanner sc = new Scanner(System.in);
		int suma = 0;

		ArrayList<String> cantidades = getLineasFichero(fichEntrada);

		int limite = 0;
		System.out.println("CANTIDAD LIMITE");
		limite = sc.nextInt();

		for (String s : cantidades) {
			if (Integer.parseInt(s) < limite) {
				suma += Integer.parseInt(s);
			}

		}

		System.out.println("el total de gastos de: " + fichEntrada + " es: " + suma + " €");

		PrintWriter pw = getPrintWriter(fichSalida);
		pw.println(suma);
		pw.close();

	}

	public static void main(String[] args) {
		String ent, sal;
		String cantidad;
		Scanner sc = new Scanner(System.in);

		System.out.println("fichero de entrada: ");
		ent = args[0];

		System.out.println("fichero de salida: ");
		sal = args[1];

		System.out.println("Cantidad limite salida: ");
		cantidad = args[2];

		try {
			hacerCalculos(ent, sal);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static BufferedReader getBufferedReader(String nombreFichero) throws FileNotFoundException {

		FileReader lector;
		lector = new FileReader(nombreFichero);
		BufferedReader bufferedReader = new BufferedReader(lector);
		return bufferedReader;
	}

	public static PrintWriter getPrintWriter(String nombreFichero) throws IOException {
		FileWriter fileWriter = new FileWriter(nombreFichero);
		PrintWriter printWriter = new PrintWriter(fileWriter);
		return printWriter;
	}

	public static ArrayList<String> getLineasFichero(String nombreFichero) throws IOException {
		ArrayList<String> lineas = new ArrayList<String>();

		BufferedReader bfr = getBufferedReader(nombreFichero);

		String linea = bfr.readLine();

		while (linea != null) {

			lineas.add(linea);
			linea = bfr.readLine();
		}

		return lineas;
	}
}