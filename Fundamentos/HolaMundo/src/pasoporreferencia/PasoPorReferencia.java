/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoporreferencia;

import clases.Persona;

public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = null;
        //persona1.nombre = "Juan";
        //System.out.println("nombre de persona1:  = " + persona1.nombre );
        persona1 = cambiarValor(persona1);
        //System.out.println("persona1 = " + persona1.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        if(persona == null){
            System.out.println("Valor de persona invalido: null");
            return persona;
        }
        persona.nombre = "Pepe";
        return persona;
    }
}
