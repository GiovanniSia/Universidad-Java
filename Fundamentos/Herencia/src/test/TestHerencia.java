package test;

import domain.Cliente;
import domain.Empleado;
import domain.Persona;
import java.util.Date;

public class TestHerencia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Juan", 20000);
        System.out.println("empleado1 = " + empleado1);
        
        var fecha = new Date();
        
        
        Cliente cliente1 = new Cliente(true, "pepe", 'M', 23, "Ferudio", fecha);
        System.out.println("cliente1 = " + cliente1);
        
        Persona persona =  new Persona();
    }
}
