package exceptions.exception;

public class MyIllegalStateException extends IllegalStateException{
    public MyIllegalStateException() {
    }

    public MyIllegalStateException(String s) {
        super(s);
    }

    public MyIllegalStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyIllegalStateException(Throwable cause) {
        super(cause);
    }

}
