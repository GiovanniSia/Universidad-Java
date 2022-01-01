package pasoporvalor;

public class PasoPorValor {
    public static void main(String[] args) {
        var x = 10;
        System.out.println("x = " + x);
        
        //Estamos pasando una copia solamente
        x = cambioValor(x);
        System.out.println("x nuevo valor: = " + x);
    }
   public static int cambioValor(int arg1){
       arg1 = 15;
       System.out.println("arg1 = " + arg1);
       return arg1;
   }
}
