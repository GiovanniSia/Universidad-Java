package mundopc.test;

import mundopc.*;


public class MundopcTest {
    public static void main(String[] args) {
        Orden orden1=new Orden();
        Computadora computadora1=new Computadora("Pampa", new Monitor("Lenovo", 233), new Teclado("F", "Jamachi"), new Raton("E", "Gitachi"));
        Computadora computadora2=new Computadora("Pampa", new Monitor("Lenovo", 233), new Teclado("F", "Jamachi"), new Raton("E", "Gitachi"));
        orden1.agregarComputadora(computadora1);
        orden1.agregarComputadora(computadora1);
         
        orden1.mostrarOrden();
              
        Orden orden2=new Orden();
        Computadora computadora3=new Computadora("Pampa", new Monitor("Lenovo", 233), new Teclado("F", "Jamachi"), new Raton("E", "Gitachi"));      
        Computadora computadora4=new Computadora("Pampa", new Monitor("Lenovo", 233), new Teclado("F", "Jamachi"), new Raton("E", "Gitachi"));
        orden2.agregarComputadora(computadora3);
        orden2.agregarComputadora(computadora4);
        
        orden2.mostrarOrden();
        
        Orden orden3=new Orden();
        Computadora computadora5=new Computadora("Pampa", new Monitor("Lenovo", 233), new Teclado("F", "Jamachi"), new Raton("E", "Gitachi"));      
        Computadora computadora6=new Computadora("Pampa", new Monitor("Lenovo", 233), new Teclado("F", "Jamachi"), new Raton("E", "Gitachi"));      
        orden3.agregarComputadora(computadora5);
        orden3.agregarComputadora(computadora6);
        orden3.mostrarOrden();
    }
}
