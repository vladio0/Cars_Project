package exception;

<<<<<<< HEAD
public class TransportException extends Exception{
    public TransportException() {
=======
public class TransportException extends RuntimeException {
    public TransportException(){

>>>>>>> 53996af (New version of Cars register(datebase update, structure update))
    }

    public TransportException(String message) {
        super(message);
    }

    public TransportException(String message, Throwable cause) {
        super(message, cause);
    }
}
