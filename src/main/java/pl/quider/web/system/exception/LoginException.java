package pl.quider.web.system.exception;


public class LoginException extends Exception {

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
