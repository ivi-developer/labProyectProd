package back;

public class ContraseñaIncorrectaException extends RuntimeException{

    public ContraseñaIncorrectaException(){

        super();

    }
    public ContraseñaIncorrectaException(String message){

        super(message);

    }


}
