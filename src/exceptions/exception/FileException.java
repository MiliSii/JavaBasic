package exceptions.exception;

import java.io.FileNotFoundException;

public class FileException extends FileNotFoundException {

    public FileException() {
    }

    public FileException(String s) {
        super(s);
    }
}
