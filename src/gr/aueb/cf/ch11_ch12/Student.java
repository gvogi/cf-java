package gr.aueb.cf.ch11_ch12;

/**
 * Student class definition
 * POJO class (Plain Old Java Object)
 * Is a Javabean.
 * All Javabeans are POjO's byt not all POJO's are Javabeans.
 */
public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student() {
    }

    public Student(int id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    /*  //Default constructor given by Java
   public Student() {
//        id = 0;
//        firstname = null;
//        lastname = null;
    }

    // Overloaded constructor
    public Student(int id, String firstname, String lastname) {
       this.id = id;
       this.firstname = firstname;
       this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    }*/
}
