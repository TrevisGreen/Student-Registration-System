import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User implements StudentInterface, java.io.Serializable {
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

    // Student methods
    public static void viewAllCourses() {
        System.out.println(crsMain.courseArrayList);
    }

    public static String fullCourseId = null;
    public static void viewNotFullCourses() throws IOException {
        Course course = new Course();
        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            if(course.getEnrolledStudents() != course.getMaxStudents()) {
                String courseId = course.getCourseId();
                fullCourseId = courseId;
                System.out.println(courseId);
            }
        }
    }

    public  static void register() {
        Course course = new Course();
        ArrayList<String> regCourse = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
    }

    public static void withdraw() {

    }

    public static void viewYourCourses() {
        System.out.println(crsData.courses.toString());
    }
}
