package Ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {

		String[] ficheroEntrada = { "informatica.txt", "gerencia.txt", "contabilidad.txt", "comercio.txt" };
		String[] ficheroSalida = { "informaticaTotal.txt", "gerenciaTotal.txt",
				"contabilidadTotal.txt", "comercioTotal.txt" };
		String[] ficheroError = { "informaticaError.txt", "gerenciaError.txt", "contabilidadError.txt",
				"comercioError.txt" };

		ProcessBuilder processBuilder;
		String path = System.getProperty("user.dir");
		String paquete = "\\src\\Ejercicio1\\";
		String ruta = path + paquete;
		
		Scanner sc = new Scanner(System.in);
	//	System.out.println("CANTIDAD LIMITE");
		//int limite= sc.nextInt();
		

		for (int i = 0; i < ficheroEntrada.length; i++) {

			processBuilder = new ProcessBuilder("java", ruta + "Calculadora.java", ruta+ficheroEntrada[i], ruta+ficheroSalida[i]);
			processBuilder.redirectError(new File(ruta+ficheroError[i]));
			try {
				processBuilder.start();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		int total =0;
		int parcial =0;

		for (int i = 0; i < ficheroEntrada.length; i++) {
			try {
				
				BufferedReader bufferedReader = Calculadora.getBufferedReader(ruta+ficheroSalida[i]);
				parcial = Integer.parseInt(bufferedReader.readLine());
				total = total+parcial;
				System.out.println("Gastos: " +ficheroEntrada[i]+" : "+parcial);

			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			} catch (NumberFormatException e) {
				
				e.printStackTrace();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
		System.out.println("GASTOS TOTALES: "+total );
		System.out.println("Guardando en gastosTotales.txt ... " );
		try {
			PrintWriter printWriter =Calculadora.getPrintWriter(ruta+"gastosTotales.txt");
			printWriter.print(String.valueOf(total));
			printWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
