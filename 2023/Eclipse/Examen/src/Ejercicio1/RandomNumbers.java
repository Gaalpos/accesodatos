package Ejercicio1;

import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class RandomNumbers {
	
	public static int pideNumeros() {
		Scanner sc = new Scanner(System.in);
        System.out.println("Numeros a generar (DEBE SER UN NUMERO ENTERO Y MAYOR A CERO):");
        int num= sc.nextInt();
        if(num>0) {
        	return num;
        }else {
        	System.out.println("HE DICHO NUMERO ENTERO Y MAYOR A CERO!");
        	return pideNumeros();
        }
	}
	
    public static void main(String[] args) {
    	
    	int numeros = pideNumeros();
    	System.out.println("NO SE POR QUE NO ME APARECE DE PRIMERAS EL JFILECHOOSER.");
    	System.out.println("LA VENTANA SE CREA, USAR ALT TABULADOR PARA SELECCIONARLA ");
        
        JFileChooser fileChooser = new JFileChooser();
        int valor = fileChooser.showOpenDialog(null);
        
        
        // NOTA: la ventana de seleccion no aparece directamente pero si se crea
        // USAR ALT TABULADOR PARA SELECCIONARLA
        if (valor == JFileChooser.APPROVE_OPTION) {
            try {
                FileWriter writer = new FileWriter(fileChooser.getSelectedFile(), true);
                BufferedWriter bufferedWriter = new BufferedWriter(writer);
                Random random = new Random();
                bufferedWriter.write("---"+ "\n");
                for (int i = 0; i < numeros; i++) {
                    int randomNumber = random.nextInt(101);
                    bufferedWriter.write(randomNumber + "\n");
                }
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            JOptionPane.showMessageDialog(null, "No has seleccionado ningun archivo");
        }
    }
}