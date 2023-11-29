package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
  public static void main(String[] args) {
    var persona1 = new Persona();
    persona1.nombre = "Juan";
    persona1.apellido = "Perez";

    System.out.println("persona1 nombre = " + persona1.nombre);

    cambioValor(persona1);

    System.out.println("persona1 nuevo nombre = " + persona1.nombre);
  }

  public static void cambioValor(Persona persona) {
    persona.nombre = "karla";
  }
}
