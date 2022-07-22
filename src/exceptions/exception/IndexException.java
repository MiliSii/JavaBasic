package exceptions.exception;

public class IndexException extends IndexOutOfBoundsException{
    public IndexException() {
    }

    public IndexException(String s) {
        super(s);
    }

    public IndexException(int index) {
        super(index);
    }
}
