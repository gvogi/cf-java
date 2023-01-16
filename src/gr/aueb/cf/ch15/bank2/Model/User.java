package gr.aueb.cf.ch15.bank2.Model;

public class User {
    private String firstname;
    private String lastname;
    private String ssn;

    public User() {
    }

    public User(String firstname, String lastname, String ssn) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

//    copy constructor
    public User(User user) {
        firstname = user.getFirstname();
        lastname = user.getLastname();
        ssn = user.getSsn();
//        firstname = user.firstname;
//        lastname = user.lastname;
//        ssn = user.ssn;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", ssn='" + ssn + '\'' +
                '}';
    }
}
