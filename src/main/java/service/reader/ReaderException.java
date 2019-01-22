package service.reader;

public class ReaderException extends Exception {
    public ReaderException(String message){
        super(message);
    }
    public ReaderException (String message, Exception e){
        super(message, e);
    }
}
