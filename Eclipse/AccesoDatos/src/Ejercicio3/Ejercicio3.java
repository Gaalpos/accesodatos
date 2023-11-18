/*  1.Escribe un programa que guarde en un fichero el contenido de otros dos ficheros, 
de tal forma que en el fichero resultante aparezcan las líneas de los 
primeros dos ficheros mezcladas, es decir, la primera línea será del primer fichero, 
la segunda será del segundo fichero, la tercera será la siguiente del primer fichero, etc.

·Los nombres de los dos ficheros origen y el nombre del fichero destino se deben 
pasarse por texto o bien emplear JFileChooser
Hay que tener en cuenta que los ficheros dedonde se van cogiendo las líneas 
pueden tener tamaños diferentes en cuanto al número de líneas.

2.Realiza un programa en Java donde introduzcas por tecaldo la ruta de un fichero por 
teclado y un texto que queramos a escribir en el fichero con JOptionPane.showInputDialog
 Posteriormente, muestra el contenido del fichero.

Haz una versión alternativa empleando JFileChooser

3. Crea un programa en Java que lea el contenido de un archivo de que indique el 
usuario y reemplace todas las ocurrencias de una
palabra por otra. Ambas palabras serán solicitadas al usuario.
El resultado debe guardarse en otro archivo de texto llamado "reemplazo.txt"
 */
import java.io.*;
import javax.swing.JFileChooser;

public class Ejercicio3 {

  public static void main(String[] args) {
    File file1 = new File("./uno.txt");
    File file2 = new File("./dos.txt");

    FileReader fr = new FileReader(file1);
    FileReader fr2 = new FileReader(file2);
  }
}
