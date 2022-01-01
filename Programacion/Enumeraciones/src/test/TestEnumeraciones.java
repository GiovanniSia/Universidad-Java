package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        //DIAS
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.MARTES);

        //CONTINENTES
        System.out.println("Continente: " + Continentes.AFRICA);
        System.out.println("Numero de paises: " + Continentes.AFRICA.getPaises());

    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("Primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
        }
    }

}
    