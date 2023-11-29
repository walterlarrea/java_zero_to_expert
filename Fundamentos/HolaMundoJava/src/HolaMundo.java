// Mi clase en Java
public class HolaMundo {
  public static void main(String args[]) {
    int miVariableEntera = 10;
    System.out.println(miVariableEntera);

    miVariableEntera = 5;
    System.out.println(miVariableEntera);

    String miVariableCadena = "Saludos";
    System.out.println(miVariableCadena);

    miVariableCadena = "Adios";
    System.out.println(miVariableCadena);

    // Inferencia de tipos en Java
    var miVariableEntera2 = 15;
    System.out.println(miVariableEntera2);

    var miVariableCadena2 = "Inferencia de tipos";
    System.out.println("miVariableCadena2 = " + miVariableCadena2);

    // No permitidos o no recomendados
    // var #MiVariable = 5;
    // var áMiVariable = 4;
    // var 1MiVariable = 3;
    var _MiVarible = 2;
    var $MiVariable = 1;
  }
}
