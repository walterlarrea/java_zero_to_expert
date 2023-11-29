package operaciones;

public class Aritmetica {
  int a;
  int b;

  public Aritmetica() {
    System.out.println("Ejecutando constructor");
  }

  public Aritmetica(int a, int b) {
    this.a = a;
    this.b = b;
    System.out.println("Ejecutando constructor con argumentos");
  }

  public void sumar() {
    int resultado = a + b;
    System.out.println("resultado = " + resultado);
  }

  public int sumarConRetorno() {
    return a + b;
  }

  public int sumarConArgumentos(int a, int b) { // Los argumentos son parte de la firma del metodo
    this.a = a;
    this.b = b;
    return this.sumarConRetorno();
  }
}
