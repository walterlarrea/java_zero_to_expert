import java.util.Scanner;

public class SistemaDeCalificaiones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("Proporciona un valor entre 0 y 10:");
        float val = Float.parseFloat(consola.nextLine());

        String calificacion;
        if (val > 10 || val < 0) {
            calificacion = "Valor fuera del rango admitido";
        } else if (val >= 9) {
            calificacion = "A";
        } else if (val >= 8) {
            calificacion = "B";
        } else if (val >= 7) {
            calificacion = "C";
        } else if (val >= 6) {
            calificacion = "D";
        } else if (val >= 0) {
            calificacion = "F";
        } else {
            calificacion = "Valor fuera del rango admitido";
        }

        System.out.println(calificacion);
    }
}
