package gr.aueb.cf.ch12;

public class Student {
    public  int id;
    public String firstname;
    public String lastname;

    /**
     * Default Constructor. Populates the estate
     */
    public Student() {

    }

    /**
     *Overloaded constructor. Populates he state
     * of the instance based on specific values that
     * are given.
     *
     * @param id
     *      The id of the {@link Student}.
     * @param firstname
     *      The firstname of the {@link Student}.
     * @param lastname
     *      the lastname of the {@link Student}.
     */
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname(){
            return firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLastname(){
        return lastname;
    }
}
