package clases;

public class Caja {
  public int ancho;
  public int alto;
  public int profundo;

  public Caja() {

  }

  public Caja(int ancho, int alto, int profundo) {
    this.ancho = ancho;
    this.alto = alto;
    this.profundo = profundo;
  }

  public int calcularVolumen() {
    return ancho * alto * profundo;
  }
}