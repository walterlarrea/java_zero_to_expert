public class Cadenas {
  public static void main(String[] args) {
    var usuario = "Juan";
    var titulo = "Ingeniero";
    var union = titulo + " " + usuario;
    System.out.println("union = " + union);

    var i = 3;
    var j = 4;
    System.out.println(i + j); // Se realiza la suma de numeros
    System.out.println(i + j + usuario); // "7Juan"
    System.out.println(usuario + i + j); // "Juan34" Contexto cadena todo es una cadena
    System.out.println(usuario + (i + j)); // "Juan7" Uso de parentesis modifican la prioridad en la evaluacion

    var nombre = "Karla";
    System.out.println("Nueva linea: \n" + nombre);
    System.out.println("Tabulador: \t" + nombre);
    System.out.println("Retroceso: \b" + nombre);
    System.out.println("Retroceso: \b\b" + nombre);
    System.out.println("Comilla simple: '" + nombre + "'");
    System.out.println("Comilla doble: \"" + nombre + "\"");
  }
}
