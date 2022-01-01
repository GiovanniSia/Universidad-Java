package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersonas;
    
    // BLoque de inicializacion estatico (se inicializa primero)
    // Se va ejecutar una vez que se crea en memoria la clase
    static{
        System.out.println("Ejecucion bloque estatico");
        //No se puede usar "this" ya que es un bloque estatico
        ++Persona.contadorPersonas;
        //idPersona = 10; no se puede porque es no estatico
    }
    
    // Bloque de inicializacion no estatico (se inicializa segundo)
    // Se ejecuta cada vez que creemos un objeto de esta clase
    {
        System.out.println("Ejecucion de bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
       
}
