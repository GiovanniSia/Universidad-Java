package test;

import domain.Gerente;

public class TestSobreescriptura {
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Sistemas", "Juan", 5000);   
        System.out.println("gerente1 = "+ gerente1.obtenerDetalles());
    }
}
