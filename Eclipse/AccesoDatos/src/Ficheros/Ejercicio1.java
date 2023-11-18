package Ficheros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);


    try {
      System.out.println("Introduce un numero");
      int num = sc.nextInt();
      System.out.println("has introducido un numero");
    } catch (InputMismatchException e) {
      System.out.println(" Tipo de dato incorrecto");
    }
  }

}
