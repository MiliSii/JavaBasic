package exceptions.exception;

public class MyArithmeticException extends ArithmeticException{
    public MyArithmeticException() {
    }

    public MyArithmeticException(String s) {
        super(s);
    }
}
