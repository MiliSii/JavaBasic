package exceptions;

public class InvalidNumberOfPeople extends Exception{

    public InvalidNumberOfPeople() {
    }

    public InvalidNumberOfPeople(String message) {
        super(message);
    }

    public InvalidNumberOfPeople(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumberOfPeople(Throwable cause) {
        super(cause);
    }

    public InvalidNumberOfPeople(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
