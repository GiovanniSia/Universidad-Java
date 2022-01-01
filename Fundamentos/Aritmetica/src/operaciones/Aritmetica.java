package operaciones;

public class Aritmetica {

    int a;
    int b;

    //Constructor vacio
    public Aritmetica(){
        System.out.println("Ejecutando Construcctor");
        
    }
    
    
    //Metodos
    public void sumar() {
        int resultadoSuma = this.a + this.b;
        System.out.println("resultadoSuma = " + resultadoSuma);
    }

    public int sumarConRetorno() {
        return this.a + this.b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a = a;
        this.b= b;
        return this.sumarConRetorno();
    }
}
