package test;

import domain.*;

public class TestSobreescriptura {
    // POLIMORFISMO
    
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan",5000);
        //System.out.println("Empleado = "+ empleado.obtenerDetalles());
        
        imprimir(empleado);
        
        empleado = new Gerente("Contabilidad", "karla",40900);
        //System.out.println("gerente = "+ gerente.obtenerDetalles());
        imprimir(empleado);
    }
    
    public static void imprimir(Empleado empleado){
        String detalles = empleado.obtenerDetalles();
        System.out.println("empleado = " + detalles);
    }
    
}
