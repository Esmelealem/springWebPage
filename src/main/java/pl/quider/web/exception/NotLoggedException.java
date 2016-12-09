package pl.quider.web.exception;

public class NotLoggedException extends RuntimeException {
    public static final String NOT_LOGGED_CAUSE = "You are not logged in to allegro webservice. You have to be logged in first to perform.";

    public NotLoggedException(String string) {
        super(string);
    }

}
