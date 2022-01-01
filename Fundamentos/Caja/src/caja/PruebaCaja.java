/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja = new Caja(2,6,3);
        int volumen = caja.volumen();
        System.out.println("volumen = " + volumen);
    }
}
