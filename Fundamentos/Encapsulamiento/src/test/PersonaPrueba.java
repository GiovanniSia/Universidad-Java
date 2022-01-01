package test;
import dominio.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona personal = new Persona("Juan",5000.00,false);
        System.out.println("personal nombre = " + personal);
        personal.setNombre("Pepe");
        System.out.println("personal nombre = " + personal);
    }
}
