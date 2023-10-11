package Ejercicio1;


import java.io.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio3v2 {

    public static void escribe(String archivo, String texto) {
        try (BufferedWriter escribe = new BufferedWriter(new FileWriter(archivo))) {
            escribe.write(texto);
            System.out.println("Texto escrito");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero: " + e.getMessage());
        }
    }

    public static void lee(String archivo) {
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            StringBuilder contenido = new StringBuilder();
            String line;
            while ((line = lector.readLine()) != null) {
                contenido.append(line).append("\n");
            }
            System.out.println("Contenido del fichero: " + contenido.toString());
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
     
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Selecciona un archivo");

       
        int seleccion = fc.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File elegido = fc.getSelectedFile();
            String archivo = elegido.getAbsolutePath();

            String texto = JOptionPane.showInputDialog("Texto a escribir:");
            escribe(archivo, texto);
            lee(archivo);
        } else {
            System.out.println("No se ha seleccionado ningún archivo.");
        }
    }
}
