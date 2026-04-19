package exception;

<<<<<<< HEAD
public class CityRegisterException extends Exception{
   private String code;

=======
public class CityRegisterException extends Exception {
    private String code;
>>>>>>> 53996af (New version of Cars register(datebase update, structure update))

    public CityRegisterException(String code, String message) {
        super(message);
        this.code = code;
    }

    public CityRegisterException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }

<<<<<<< HEAD
    public String getCode() {
=======
    public String getCode(){
>>>>>>> 53996af (New version of Cars register(datebase update, structure update))
        return code;
    }
}
