package exceptions;

public class ExampleCh1Exception extends ClassNotFoundException{

    public ExampleCh1Exception(String message, Throwable cause) {
        super(message, cause);

    }

    public ExampleCh1Exception(String s) {
        super(s);
    }
}
