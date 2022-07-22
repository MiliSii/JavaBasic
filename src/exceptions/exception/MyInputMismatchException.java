package exceptions.exception;

import java.util.InputMismatchException;

public class MyInputMismatchException extends InputMismatchException {
    public MyInputMismatchException() {
    }

    public MyInputMismatchException(String s) {
        super(s);
    }
}
