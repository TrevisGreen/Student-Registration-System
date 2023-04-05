import java.io.IOException;
import java.util.Scanner;

public class Admin extends User {

    // constructor with params
    public Admin(String fn, String ln, String usn, String psw) {
        String firstName = fn;
        String lastName = ln;
        String userName = usn;
        String password = psw;
    }

    // Instantiate course object from constructor
    public static String createCourses() throws IOException {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Course Name: ");
        String courseName = input.nextLine();

        System.out.print("Course Id: ");
        String courseId = input.nextLine();

        System.out.print("Max Number Of Students: ");
        int maxStudents = input2.nextInt();

        int currentStudents = 0;

        System.out.println("Course Instructor: ");
        String courseInstructor = input.nextLine();

        System.out.print("Section Number: ");
        int sectionNumber = input2.nextInt();

        System.out.print("Course Location: ");
        String courseLocation = input.nextLine();
    }

    public static void deleteCourse() {

    }
}
