package gr.aueb.cf.ch11_ch12.exercises_ch11.model;

/**
 * Defines a user's personal info
 */
public class User {
    private Long id;
    private String firstname;
    private String lastname;

    public User() {
    }

    public User(Long id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Long getId() {return id;}

    public void setId(Long id) {this.id = id;}

    public String getFirstname() {return firstname;}

    public void setFirstname(String firstname) {this.firstname = firstname;}

    public String getLastname() {return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    /**
     * User's personal info
     * @return String with user's personal info
     */
    public String getUserInfo() {return id + ", " + firstname + ", " + lastname;}
}
