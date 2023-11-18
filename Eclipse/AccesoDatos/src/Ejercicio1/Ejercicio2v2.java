package Ejercicio1;

import java.io.*;

public class Ejercicio2v2 {

    public static void mix(String file1, String file2, String result) {
        try (
        	BufferedReader lector1 = new BufferedReader(new FileReader(file1));
             BufferedReader lector2 = new BufferedReader(new FileReader(file2));
             BufferedWriter escritor = new BufferedWriter(new FileWriter(result))) {

        	 String linea1, linea2;

             
             while ((linea1 = lector1.readLine()) != null && (linea2 = lector2.readLine()) != null) {
                 escritor.write(linea1);
                 escritor.newLine();
                 escritor.write(linea2);
                 escritor.newLine();
             }
             while ((linea1 = lector1.readLine()) != null) {
                 escritor.write(linea1);
                 escritor.newLine();
             }
             while ((linea2 = lector2.readLine()) != null) {
                 escritor.write(linea2);
                 escritor.newLine();
             }

             System.out.println("Mezla guardada en" + result);
         } catch (IOException e) {
             System.out.println("Error: " + e.getMessage());
         }
    }

    public static void main(String[] args) {
        String file1 = "uno.txt"; 
        String file2 = "dos.txt"; 
        String result = "resultado.txt"; 

        mix(file1, file2, result);
    }
}

