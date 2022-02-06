package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Miercoles");

        TestColecciones.imprimir(miLista);
//        for (Object elemento : miLista) {
//            System.out.println("Elemento = " + elemento);
//        }
//        // Utilizando expresiones lambda
//        miLista.forEach(elemento -> {
//            System.out.println("Elemento = " + elemento);
//        });      
        Set miSet = new HashSet();
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
        miSet.add("Domingo");
        TestColecciones.imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Perez");
        
        String elemento = (String) miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
        
    }

    // Polimorfismo
    public static void imprimir(Collection coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento = " + elemento);
        });
    }

}
