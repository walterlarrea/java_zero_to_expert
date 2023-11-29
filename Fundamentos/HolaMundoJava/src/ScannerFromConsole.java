import java.util.Scanner;

public class ScannerFromConsole {
  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);

    System.out.println("Proporciona el titulo:");
    var titulo = consola.nextLine();

    System.out.println("Escribe autor del libro:");
    var autor = consola.nextLine();

    System.out.println(titulo + " fue escrito por " + autor);
  }
}