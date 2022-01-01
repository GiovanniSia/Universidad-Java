package domain;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String departamento, String nombre, double sueldo) {
        super(nombre, sueldo);
        this.departamento = departamento;
        this.nombre = "Pepe";
    }
    
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", departamento: " + this.departamento;
    }
    
    
}
