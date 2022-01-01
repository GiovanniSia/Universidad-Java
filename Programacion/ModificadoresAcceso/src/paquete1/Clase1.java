package paquete1;

class Clase1 {

    private String atributoDefaultPackage = "Valor atributo private";

    private Clase1() {
        System.out.println("Constructor privado");
    }

    public Clase1(String argumento){
        this();
        System.out.println("Constructor publico");
    }
    private void metodoPrivado() {
        System.out.println("Metodo default");
    }

    public String getAtributoDefaultPackage() {
        return atributoDefaultPackage;
    }

    public void setAtributoDefaultPackage(String atributoDefaultPackage) {
        this.atributoDefaultPackage = atributoDefaultPackage;
    }
    
}
