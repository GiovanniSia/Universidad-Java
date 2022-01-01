package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3,4,5);
        imprimirNumeros(1,2); // Por esto se manejan argumentos variables
        variosParametros("Juan",1,2,3,4,5);
    }
    
    // "int... numeros" tiene que ser si o si el ultimo argumento del metodo
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre: "+ nombre);
        imprimirNumeros(numeros);
    }
    
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento: "+ numeros[i]);
        }
    }
}
