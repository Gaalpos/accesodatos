import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Boletin02Ficheros {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcion = 0;
    File fichUsuario = null;
    do {
      System.out.println("Introduce una de las opciones");
      System.out.println("1. Crear archivo con datos personales");
      System.out.println("2. Mostrar archivo creado");
      System.out.println("3. Crear fichero y mostrar may/min invertidas");
      System.out.println("4. Salir");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          fichUsuario = crearFicheroDatosUsuario();
          break;
        case 2:
          if (fichUsuario != null && fichUsuario.exists()) {
            mostrarFichero(fichUsuario);
          } else {
            System.out.println("El fichero no existe");
          }

          break;
        case 3:
          break;
        case 4:
          break;
        default:
          System.out.println("Opcion incorrecta");
      }
    } while (opcion != 4);
  }

  public static File crearFicheroDatosUsuario() {
    Scanner sc = new Scanner(System.in);
    File fichero = new File("C:\\Users\\usuario\\Desktop\\DatosUsuario.txt");

    try {
      System.out.println("Introduce tu nombre");
      String nombre = sc.nextLine();
      FileWriter fw = new FileWriter(fichero, true);
      fw.write(nombre + "\n");

      System.out.println("Introduce tu apellido");
      String apellido = sc.nextLine();
      fw.write(apellido + "\n");

      System.out.println("Introduce la población de nacimiento");
      String poblacion = sc.nextLine();
      fw.write(poblacion + "\n");
      fw.close();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return fichero;
  }

  public static void mostrarFichero(File fichero) {
    try {
      FileReader fr = new FileReader(fichero);
      BufferedReader br = new BufferedReader(fr);
      String linea;
      try {
        while ((linea = br.readLine()) != null) {
          System.out.println(linea);
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
      br.close();
      fr.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  public static void mostrarFicheroAlternando(File fichero) {
    try {
      FileReader fr = new FileReader(fichero);
      BufferedReader br = new BufferedReader();
    } catch (Exception e) {
      // TODO: handle exception
    }
  }
}
