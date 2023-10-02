import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Methods {

  public static String inputString() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe el nombre");
    return sc.nextLine();
  }
}
