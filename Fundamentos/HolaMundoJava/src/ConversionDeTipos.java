import java.util.Scanner;

public class ConversionDeTipos {
    public static void main(String[] args) {
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);

        var consola = new Scanner(System.in);
        // System.out.println("Proporciona tu edad");
        // edad = Integer.parseInt(consola.nextLine());
        // System.out.println("edad = " + edad);

        //
        var edadTexto = String.valueOf(edad);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "hola".charAt(0);
        System.out.println("Caracter = " + caracter);

        System.out.println("Proporciona un caracter");
        caracter = consola.nextLine().charAt(0);
        System.out.println("Caracter = " + caracter);
    }
}
