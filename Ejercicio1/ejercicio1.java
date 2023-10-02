import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * 1o) Realizar un programa Java que utiliza la clase File. 
 * Deberá crear un directorio, dentro de dicho
directorio creará dos ficheros, hay que comprobar si existe;
 a uno de los ficheros le cambiará de
nombre y el otro se eliminará. Además mostrará los 
ficheros de un directorio. El nombre del
directorio se pasará al programa desde el teclado al ejecutarlo.
 El programa deberá mostrar también
información de un fichero cuyo nombre también se introducirá por teclado.
 */

public class ejercicio1 {

  static final String BASE_DIRECTORY = "C:\\DAM\\accesodatos\\Ejercicio1\\";

  public static String inputString() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el nombre");
    return sc.nextLine();
  }
  public static void createFile(String fileName) {
    File file = new File(BASE_DIRECTORY + fileName);
    if (!file.exists()) {
      try {
        boolean creado = file.createNewFile();
        if (creado) {
          System.out.println("Archivo creado");
        } else {
          System.out.println("Fallo al crear archivo");
        }
      } catch (IOException e) {
        System.out.println("ERROR" + e.getMessage());
      }
    }
  }

  public static void main(String[] args) {
    String directoryName = inputString();

    File dir = new File(directoryName);
    File fullDirectory = new File(BASE_DIRECTORY + directoryName);

    if (!fullDirectory.exists()) {
      boolean creado = fullDirectory.mkdir();

      if (creado) {
        System.out.println("Creando directorio: " + dir);
        System.out.println("Directorio creado");
        System.out.println("Archivo 1");
        createFile(dir+ "\\"+inputString());
        System.out.println("Archivo 2");
        createFile(dir+ "\\"+ inputString());
      } else {
        System.out.println("Fallo al crear directorio");
      }
    }
  }
}
