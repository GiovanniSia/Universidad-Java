package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        System.out.println("Persona.MI_CONSTANTE = " + Persona.MI_CONSTANTE);
        var a=Persona.MI_CONSTANTE;
        //miVariable = 6; // error
        
        final Persona persona1;
        persona1 = new Persona();
        
        //persona1 = new Persona(); ERROR
        
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        
        persona1.setNombre("Pepe");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}
