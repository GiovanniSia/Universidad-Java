
package caja;

public class Caja {


    int alto;
    int profundo;
    int ancho;

    public Caja() {
    }

    
    public Caja(int alto, int profundo, int ancho) {
        this.alto = alto;
        this.profundo = profundo;
        this.ancho = ancho;
    }
    
    public int volumen(){
        return ancho*alto*profundo;
    }

    
    
}
