package FicherosBinarios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Boletin01 {

	public static void main(String[] args) {

		File archivo1 = new File("fichOriginal.txt");
		File archivo2 = new File("FicheroFinal.txt");

		try {
			FileReader fr = new FileReader(archivo1);
			BufferedReader br = new BufferedReader(fr);
			FileWriter fw = new FileWriter(archivo2);
			BufferedWriter bw = new BufferedWriter(fw); 

			String cadenaOriginal = br.readLine();
			String [] cadena = cadenaOriginal.split(" ");
			String resultado="";
			
			for(String a:cadena ) {
				resultado +=a;
			}
			bw.write(resultado);
			fw.close();
			fr.close();
			br.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}

}
