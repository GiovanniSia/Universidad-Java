package test;

import domain.Persona;

public class PersonaPrueba {
    private int contador;
    
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan");
        Persona persona2 = new Persona("Pepe");
        imprimir(persona1);
        imprimir(persona2);
      
        //this.contador  // ERROR  
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){ 
        imprimir(new Persona("Carlos")); // STATIC
        return this.contador; // THIS
    }
}
