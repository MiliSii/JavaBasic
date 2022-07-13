package exceptions;

public class MyArrayIndexOutOfBoundsException extends ArrayIndexOutOfBoundsException{
    public MyArrayIndexOutOfBoundsException() {
    }

    public MyArrayIndexOutOfBoundsException(String s) {
        super(s);
    }

    public MyArrayIndexOutOfBoundsException(int index) {
        super(index);
    }
}
