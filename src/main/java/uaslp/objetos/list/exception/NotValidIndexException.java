package uaslp.objetos.list.exception;

//Throwable (Error y Exception)

public class NotValidIndexException extends Exception{
    public NotValidIndexException(int wrongIndex){
        //Index + index + is out of bounds
        super("Index " + wrongIndex + " is out of bounds");
    }
}
