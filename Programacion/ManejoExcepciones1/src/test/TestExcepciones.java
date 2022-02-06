package test;

import static aritmentica.Aritmentica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {

    public static void main(String[] args) {
        int resultado = 0;
        try {
            resultado = division(1, 0);
        
        // Los catch tienen que ir de menor a mayor jerarquia    
        } catch(OperacionExcepcion ex){ // menor jerarquia
            System.out.println("Ocurrio un error de tipo OperacionExcepcion");
            System.out.println(ex.getMessage());
        } catch (Exception ex) { // mayor jerarquia
            System.out.println("Ocurrio un error de tipo Exception ");
            // con *ex.printStackTrace* mostramos la pila de excepcion
            ex.printStackTrace(System.out);
            System.out.println(ex.getMessage());
        }
        // Finally es una palabra reservada
        // significa que siempre se va ejecutar este bloque
        // sin importaar si tenemos excepcion o no
        finally{
            System.out.println("Se reviso la division entre cero");
        }
            System.out.println("division = " + resultado);
    }
}
