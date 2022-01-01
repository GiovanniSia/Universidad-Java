package test;

import operaciones.Operaciones;

public class TestOperaciones {
    public static void main(String[] args) {
        System.out.println("Entrando al main");
        var resultado = Operaciones.sumar(5, 3);
        System.out.println("resultado = " + resultado);
        
        var resultado2 = Operaciones.sumar(2, 3.5);
        System.out.println("resultado2= " + resultado2);
        
        var resultado3 = Operaciones.sumar(2, 3L);
        System.out.println("resultado3= " + resultado3);
    }
}
