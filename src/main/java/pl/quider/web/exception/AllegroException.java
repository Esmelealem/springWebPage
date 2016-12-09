package pl.quider.web.exception;

public class AllegroException extends RuntimeException {

    public AllegroException(Exception e) {
        super(e);
    }

}