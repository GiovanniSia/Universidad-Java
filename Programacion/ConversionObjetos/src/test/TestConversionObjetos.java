package test;

import domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        Empleado empleado;
        
        // POLIMORFISMO
        empleado = new Escritor("Juan",5000, TipoEscritura.CLASICO);
        
        System.out.println(empleado.obtenerDetalles());
        
        // DOWNCASTING de padre a hijo
        ((Escritor)empleado).getTipoEscritura();
        // o
        Escritor escritor = (Escritor) empleado;
        escritor.getTipoEscritura();
        
        // UPCASTING de hijo a padre
        //no es necesario hacer un cast
        
        Empleado empleado2 = escritor;
        System.out.println(empleado2.obtenerDetalles());
    }
    
}
