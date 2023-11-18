package JFileChooser;

import java.io.File;
import javax.swing.JFileChooser;

public class EjemplofileChooser {

  public static void main(String[] args) {
    JFileChooser fileChooser = new JFileChooser();
    int seleccion = fileChooser.showOpenDialog(fileChooser);
    if (seleccion == JFileChooser.APPROVE_OPTION) {
      File archivo = fileChooser.getSelectedFile();
      System.out.println(archivo.getName());
      System.out.println(archivo.getAbsolutePath());
    }
  }
}
