package gr.aueb.cf.ch16.exceptions;

public class SsnNotValidException extends Exception {
    private static final long serialVersionUID = 1L;

    public SsnNotValidException(String ssn) {
        super("Ssn " + ssn + " is not valid");
    }
}
