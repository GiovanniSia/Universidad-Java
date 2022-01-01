package test;

import domain.Persona;

public class TestForEach {
    public static void main(String[] args) {
        int edades[] = {5,6,7,8};
        for (int edad : edades) {
            System.out.println("edades = " + edad);
        }
    
        Persona personas[]={new Persona("David"), new Persona("Pedro")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    
    }
}
