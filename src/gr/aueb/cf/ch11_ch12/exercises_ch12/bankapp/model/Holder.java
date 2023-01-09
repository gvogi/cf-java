package gr.aueb.cf.ch11_ch12.exercises_ch12.bankapp.model;

/**
 * Defines an account's holder Credentials.<br>
 * Includes {@link #id}, {@link #firstname},
 * {@link #lastname}, {@link #ssn} <br>
 * With <i>accessor</i> methods:
 * {@link #getId()}, {@link #getFirstname()},
 * {@link #getLastname()}, {@link #getSsn()} <br>
 * Public API methods: <br>
 * {@link #convertToString()} <br>
 * Validation method: <br>
 * {@link #isSsnValid(String)}
 *
 * @author gvogiatzis
 */
public final class Holder {
    private final Long id;
    private final String firstname;
    private final String lastname;
    private final String ssn;

    /**
     * Initializes with default values
     */
    public Holder() {
        id = 0L;
        firstname = "";
        lastname = "";
        ssn = "";
    }

    /**
     * Constructs a holder instance
     * @param id holder's id
     * @param firstname holder's firstname
     * @param lastname holder's lastname
     * @param ssn holder's ssn
     */
    public Holder(Long id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    /**
     * Checks if a given ssn, equals to holder's ssn
     * @param ssn the ssn to compare
     * @return true if equals to holder's ssn,
     * false otherwise.
     */
    private boolean isSsnValid(String ssn) {
        return this.ssn.equals(ssn);
    }

    /**
     * Returns a String with holder's credentials
     * @return a String with holder's credentials
     */
    public String convertToString() {
        return "[" + id + ", " + firstname + ", " + lastname + ", " + ssn +"]";
    }
}
