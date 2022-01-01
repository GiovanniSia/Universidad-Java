
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {
        inicio:
        for (int contador = 0; contador < 10; contador++) {
            if(contador %2 !=0){
                continue inicio; // ir a la linea de codigo de la etiqueta
            }
                System.out.println("contador = " + contador);
        }
    }
}
