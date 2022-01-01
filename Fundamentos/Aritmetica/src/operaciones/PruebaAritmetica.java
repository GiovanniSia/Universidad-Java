
package operaciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        
        // Variables locales
        var a= 10;
        var b=2;
        miMetodo();
        
        Aritmetica a1 = new Aritmetica();
        a1.sumar();
        int resultado=a1.sumarConRetorno();
        System.out.println("resultado = " + resultado);

        
        resultado = a1.sumarConArgumentos(2, 3);
        System.out.println("Suma con argumentos es: "+resultado);
    }
   
    public static void miMetodo(){
//La variable a son locales y no se pueden usar        
//a=2;
        System.out.println("Otro metodo");
    }
    
}
