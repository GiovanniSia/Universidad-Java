package domain;

public class Persona {

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    private static String nombres;

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;

        Persona.nombres += nombre + ", ";
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
