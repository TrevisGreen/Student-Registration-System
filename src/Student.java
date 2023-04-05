import javax.rmi.ssl.SslRMIClientSocketFactory;

public class Student {
    public String firstName;
    public String lastName;
    public String userName;
    public String password;

   // Default constructor
    public Student() {

    }

    // Create a student object
    public static Student student = new Student();
    public Student(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
