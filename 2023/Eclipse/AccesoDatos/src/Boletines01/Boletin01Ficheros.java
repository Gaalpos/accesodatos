package Boletines01;
import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Boletin01Ficheros {

  public static void main(String[] args) {
    File directorio = new File("directorio");
    directorio.mkdir();
    File file1 = new File("directorio\\archivo1.txt");
    File file2 = new File("directorio\\archivo2.txt");
    try {
      file1.createNewFile();
      file2.createNewFile();
      if (file1.exists() && file1.isFile()) {
        System.out.println("El primer fichero existe");
      } else {
        System.out.println("El primer fichero no existe");
      }
      if (file2.exists() && file2.isFile()) {
        System.out.println("El segundo fichero existe");
      } else {
        System.out.println("El segundo fichero no existe");
      }

      /*Le cambiamos el nombre a file1 utilizando un JOptionPane*/

      String nuevoNombre = JOptionPane.showInputDialog(
        null,
        "Introduzca el nuevo nombre para el fichero 1"
      );
      if (file1.exists() && (file1.isFile())) {
        file1.renameTo(new File("directorio\\" + nuevoNombre));
      }

      /*Eliminamos file2*/
      if (file2.exists() && (file2.isFile())) {
        file2.delete();
      }

      /*Mostrar información del directorio*/
      File[] ficheros = directorio.listFiles();
      for (int i = 0; i < ficheros.length; i++) {
        System.out.println(ficheros[i].getName());
      }
      System.out.println("DE OTRA FORMA");
      String[] nombres = directorio.list();
      for (int i = 0; i < nombres.length; i++) {
        System.out.println(nombres[i]);
      }

      /* MOSTRAMOS LA INFORMACIÓN DEL FICHERO QUE OBTENEMOS POR CONSOLA*/
      String nombreAbuscar = JOptionPane.showInputDialog(
        null,
        "Introduzca el nombre del fichero"
      );
      File ficheroBuscado = new File(directorio, nombreAbuscar);
      if (ficheroBuscado.exists()) {
        System.out.println("Nombre: " + ficheroBuscado.getName());
        System.out.println("Se puede modificar: " + ficheroBuscado.canWrite());
        System.out.println("Oculto: " + ficheroBuscado.isHidden());
        System.out.println("Tamaño: " + ficheroBuscado.length());
        System.out.println(
          "Ultima modificación: " + ficheroBuscado.lastModified()
        );
        System.out.println("Ubicación: " + ficheroBuscado.getAbsolutePath());
        System.out.println("Tamaño en bytes: " + ficheroBuscado.length());
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
