public class TiposEnteros {
    public static void main(String[] args) {
    // Tipos primitivos enteros byte: 8, short: 16, int: 32, long: 64
    byte numeroByte = 120;
    System.out.println("Valor byte: " + numeroByte);
    System.out.println("Valor minimo byte: " + Byte.MIN_VALUE);
    System.out.println("Valor maximo byte: " + Byte.MAX_VALUE);

    numeroByte = (byte)128;
    System.out.println("Valor byte: " + numeroByte);

    //
    short numeroShort = 10;
    System.out.println("Valor short: " + numeroShort);
    System.out.println("Valor minimo short: " + Short.MIN_VALUE);
    System.out.println("Valor maximo short: " + Short.MAX_VALUE);

    numeroShort = (short)32768;
    System.out.println("Valor short: " + numeroShort);

    // Enteros Integer no se puede
    int numeroInt = 10;
    System.out.println("Valor int: " + numeroInt);
    System.out.println("Valor minimo int: " + Integer.MIN_VALUE);
    System.out.println("Valor maximo int: " + Integer.MAX_VALUE);
    numeroInt = (int)2147483648L;
    System.out.println("Valor int: " + numeroInt);

    //
    long numeroLong = 10;
    System.out.println("Valor long: " + numeroLong);
    System.out.println("Valor minimo long: " + Long.MIN_VALUE);
    System.out.println("Valor maximo long: " + Long.MAX_VALUE);
    numeroLong = (long)9223372036854775809F;
    System.out.println("Valor long: " + numeroLong);


    // Tipos primitivos del tipo flotante float: 32, double: 64
    float numeroFloat = (float)10.0;
    System.out.println("Valor float: " + numeroFloat);
    System.out.println("Valor minimo float: " + Float.MIN_VALUE);
    System.out.println("Valor maximo float: " + Float.MAX_VALUE);
    numeroFloat = (float)3.4028236E38D;
    System.out.println("Valor float: " + numeroFloat); // Infinity

    double numeroDouble = (double)10.0;
    System.out.println("Valor double: " + numeroDouble);
    System.out.println("Valor minimo double: " + Double.MIN_VALUE);
    System.out.println("Valor maximo double: " + Double.MAX_VALUE);
    numeroDouble = (double)1.7976931348623157E308;
    System.out.println("Valor float: " + numeroDouble); // Infinity
    }
}
