import clases.Caja;

public class PruebaCaja {
  public static void main(String[] args) {
    Caja caja1 = new Caja();
    caja1.ancho = 3;
    caja1.alto = 2;
    caja1.profundo = 6;
    var volumenCaja1 = caja1.calcularVolumen();
    System.out.println("Volumen caja1 = " + volumenCaja1);

    Caja caja2 = new Caja(3, 2, 6);
    var volumenCaja2 = caja2.calcularVolumen();
    System.out.println("Volumen caja2 = " + volumenCaja2);
  }
}
