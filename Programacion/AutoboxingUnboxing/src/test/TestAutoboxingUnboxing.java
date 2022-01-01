package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        // Clases Envolventes de tipos primitivos
        //Los tipos primitivos solo almacenan un valor
        // Las clases envolventes tienen atributos y metodos
        /*
        int - Integer
        long - Long
        float - Float
        double - Double  
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */

        // Autoboxing, la literal primitiva de tipo entero se 
        // convierte a Object
        Integer entero = 10; // Envuelve el tipo primitivo en un Object
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.toString());
        System.out.println("entero = " + entero.floatValue());

        // Unboxing, se le extrae al Object entero su valor.
        int entero2 = entero; // desemblolviendo de un Object a un tipo primitivo

    }
}
