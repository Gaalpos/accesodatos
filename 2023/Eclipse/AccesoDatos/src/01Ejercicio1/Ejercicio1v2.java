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
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio1v2 {

  public static String inputString(String message) {
    Scanner sc = new Scanner(System.in);
    System.out.println(message);
    return sc.nextLine();
  }

  public static String createFile() {
    boolean creado = false;
    String fileName = inputString("Nombre del archivo");
    while (!creado) {
      File file = new File(fileName);
      try {
        if (!file.exists()) {
          file.createNewFile();
          System.out.println("Archivo creado");
        } else {
          System.out.println("El archivo ya existe");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return fileName;
  }

  public static String createFolder() {
    boolean creado = false;
    String folderName = inputString("Nombre del directorio");
    while (!creado) {
      File folder = new File(folderName);
      try {
        if (!folder.exists()) {
          folder.mkdir();
          System.out.println("Directorio creado");
          creado = true;
        } else {
          System.out.println("El directorio ya existe, inserta otro nombre");
        }
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }
    return folderName;
  }

  public static void main(String[] args) {
    createFolder();
    createFile();
    createFile();
  }
}
