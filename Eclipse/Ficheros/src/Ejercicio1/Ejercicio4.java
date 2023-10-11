package Ejercicio1;

import java.io.*;
import javax.swing.*;

public class Ejercicio4 {

    public static void swapWords(String path, String buscada, String nueva) {
        try (
        	BufferedReader lector = new BufferedReader(new FileReader(path));
             BufferedWriter escritor = new BufferedWriter(new FileWriter("reemplazo.txt"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                
                linea = linea.replaceAll(buscada, nueva);
                escritor.write(linea);
                escritor.newLine();
            }
            System.out.println("Reemplazo completado. ");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        
        String rutaArchivo = JOptionPane.showInputDialog("Ruta del archivo");

       
        String buscada = JOptionPane.showInputDialog("Palabra a buscar:");
        String nueva = JOptionPane.showInputDialog("Palabra de reemplazo:");

       
        swapWords(rutaArchivo, buscada, nueva);
    }
}
