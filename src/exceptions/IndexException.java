package exceptions;

public class IndexException extends IndexOutOfBoundsException{
    public IndexException() {
    }

    public IndexException(String s) {
        super(s);
    }
}
