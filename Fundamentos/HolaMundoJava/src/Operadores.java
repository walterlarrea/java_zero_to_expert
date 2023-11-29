public class Operadores {
    public static void main(String[] args) {
        int a=3, b=2;
        var resultado = a + b;
        System.out.println("resultado de la suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado de la resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado de la multiplicacion = " + resultado);

        var resultadoF = 3.0 / b;
        System.out.println("resultado de la division = " + resultadoF);

        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);

        if (a % 2 == 0) // Omitimos las llaves porque hay una sola linea dentro del bloque
            System.out.println("Es numero par");
        else
            System.out.println("Es numero impar");
        
    }
}
