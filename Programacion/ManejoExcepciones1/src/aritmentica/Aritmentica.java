package aritmentica;

import excepciones.OperacionExcepcion;

public class Aritmentica {

    // No es necesario incluirle al metodo el *throws*
    public static int division(int numerador, int denominador) {
        if (denominador == 0) {
            // *throw* = arrojar, arrojamos la siguiente excepcion
            throw new OperacionExcepcion("Division entre 0");
        }
        return numerador/ denominador;
    }
}
