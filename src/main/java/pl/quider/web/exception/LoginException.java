package pl.quider.web.exception;


public class LoginException extends RuntimeException {

    public LoginException(Exception e) {
        super(e);
    }

    public LoginException(String string) {
        super( string );
    }

    /**
     *
     */
    private static final long serialVersionUID = 1L;

}
