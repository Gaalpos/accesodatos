public class Palindromo {

  public static void main(String[] args) {
    String original = "dabale arroz a la zorra el abad";

    String sinEspacios = "";
    String inversa = "";
    String inversa2 = "";

    for (int i = 0; i < original.length(); i++) {
      if (original.charAt(i) != ' ') {
        sinEspacios += original.charAt(i);
        inversa2 = original.charAt(i)+inversa2;
      }
    }

    for (int i = sinEspacios.length() - 1; i >= 0; i--) {
      inversa = sinEspacios.charAt(i) + inversa;
    }

    System.out.println(sinEspacios);
    System.out.println(inversa);
    System.out.println(inversa2);
  }
}
