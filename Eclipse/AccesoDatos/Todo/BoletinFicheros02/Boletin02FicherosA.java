package BoletinFicheros02;

import java.util.Scanner;

/*
 * Codificar un programa en Java que muestre un menú con 3 opciones:
 En la primera deberá crear un fichero (con el nombre que se quiera) en el que
indicaremos en líneas diferentes tu nombre, tus apellidos, tu ciudad de nacimiento.

 En la segunda opción deberá mostrar por pantalla el contenido del fichero creado.

 En la tercera opción crearemos un fichero cuyo nombre y contenido introducimos por
teclado. Después de crear el fichero con la información introducida, se deberá mostrar
por pantalla el texto del fichero variando entre mayúsculas y minúsculas. Por ejemplo, si
escribo Bienvenidos a Vigo deberá mostrar bIENVENIDOS A vIGO.
 */

public class Boletin02FicherosA {

  public static String inputStringS(String message) {
    Scanner sc = new Scanner(System.in);
    System.out.println(message);
    return sc.nextLine();
  }

  public static void menu() {
    System.out.println("Introduce una de las opciones");
    System.out.println("2. Crer archivo con datos personales");
    System.out.println("3. Mostrar fichero creado");
    System.out.println("3. Crear fichero y mostratrlo");
    System.out.println("4. Salir");
  }

  public static void createFile(String fileName) {}

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    do {
      menu();
      opcion = sc.nextInt();
    } while (opcion != 4);
  }
}
