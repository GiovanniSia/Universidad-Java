package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySQL;
import accesodatos.ImplementacionOracle;

public class TestInterfaces {

    public static void main(String[] args) {
        // Programar lo mas generico posible
        IAccesoDatos datos = new ImplementacionMySQL();
        // Polimorfismo
        //datos.listar();
        imprimir(datos);

        datos = new ImplementacionOracle();
        //datos.listar();
        imprimir(datos);
    }

    // Metodo generico
    public static void imprimir(IAccesoDatos datos) {
        datos.listar();
    }
}
