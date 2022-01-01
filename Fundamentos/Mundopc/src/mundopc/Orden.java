package mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private int contadorComputadoras;
    private static final int maxComputadoras = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.maxComputadoras];
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < Orden.maxComputadoras) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("Se ha superado el maximo de computadoras: " + Orden.maxComputadoras);
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden: " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("Computadora " + i + ": " + computadoras[i].toString());
        }
    }
}
