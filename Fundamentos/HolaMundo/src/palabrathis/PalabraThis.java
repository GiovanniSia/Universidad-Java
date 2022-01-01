package palabrathis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona(new String("Juan"), "Perez");
        System.out.println("persona = " + persona);
    }
}

class Persona{
    String nombre;
    String apellido;

    public Persona(String nombre, String apellido) {
        super(); // llamada implicita al constructor de la clase padre (objet)
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("obketo persona usando this: "+this);
        new Imprimir().imprimir(this);
    }
       
}

class Imprimir{
    public Imprimir(){
        super(); // el constructor de la clase object (padre) para reservar memoria
    }
    public void imprimir(Persona persona){
        System.out.println("persona desde imprimir: = " + persona);
        System.out.println("Impresion del objeto actual(this) = " + this);
    }
}


