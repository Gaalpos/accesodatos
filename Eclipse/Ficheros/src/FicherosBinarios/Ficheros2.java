package FicherosBinarios;

import java.io.*;

public class Ficheros2 {
	final static String File = "fichero.dat";
	
	public static void main(String[] args) {
		
		FileOutputStream fe= null;
		DataOutputStream ds= null;
		
		int [] enteros = {5, 18, 23, 12, 10, 1, 47};
		String [] nombres = {"Beatriz", "Ana", "Maria","Juan", "Pedro","Teresa","Marta"};
		
		try {
			fe=new FileOutputStream(File, false);
			ds= new DataOutputStream(fe);
			
			for (int i=0; i < enteros.length; i++) {
				ds.writeInt(enteros[i]);
				ds.writeUTF(nombres[i]);
			}
			 		} catch (Exception e) {
			System.out.println("no se peude leer el archivo");
		}
	}

}
