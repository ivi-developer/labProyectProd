package back;

public class ContraseniaNoCoincideException extends RuntimeException{
    public ContraseniaNoCoincideException(){
        super("Las contraseñas no coinciden");
    }
}
