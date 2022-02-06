package excepciones;

// Creamos nuestra propia clase de extencion
public class OperacionExcepcion extends RuntimeException{

    public OperacionExcepcion(String message) {
        super(message);
    }
    
}
