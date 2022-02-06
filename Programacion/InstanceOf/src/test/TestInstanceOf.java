package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan", 5000);
        determinarTipo(empleado);
        empleado = new Gerente("Contabilidad", "karla", 40900);
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo gerente");
            //((Gerente) empleado).getDepartamento(); Tambien se puede hacer asi
            Gerente gerente = (Gerente) empleado;
            System.out.println("Gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println("Es de tipo Empleado");
            //Gerente gerente = (Gerente)empleado; ERROR
            //System.out.println("Gerente = "+ gerente.getDepartamento()); ERROR
            System.out.println("Empleado = " + empleado.getNombre());
        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Object");
            empleado.toString();
        }
    }

}
