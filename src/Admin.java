import javax.swing.text.html.StyleSheet;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
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
        // Ask for courseId
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course Id: ");
        String courseId = input.nextLine();


    }

    public static void editCourse() throws IOException {
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        System.out.print("Course Id: ");
        String courseId = input.nextLine();
        int courseIndex = 0;

        // Ask user what they want to edit
        System.out.print("What would you like to edit?\n");
        System.out.print("1. Max amount of students\n");
        System.out.print("2. Course Instructor\n");
        System.out.print("3. Section Number\n");
        System.out.print("4. Class location\n");
        int choice = input.nextInt();


    }

    public static void display() throws IOException {
        Course course = new Course();
        Scanner input = new Scanner(System.in);

        // Ask user for Course Id
        System.out.print("Enter course Id: ");
        String courseId = input.nextLine();


    }

    public static void registerStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Student First Name: ");
        String firstName = input.nextLine();
        System.out.println("Student Last Name: ");
        String lastName = input.nextLine();
        String userName = null;
        String password = null;


    }

    public static void viewCourses() {

    }

    public static String fullCourseId = null;
    public static String viewFullCourses() throws IOException {
        Course course = new Course();

    }

    public static void addCourseToFile() throws IOException {
        Course course = new Course();

    }

    public static void coursesPerStudent() {
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        String lastName = input.nextLine();
        String name = firstName = " " + lastName;
        Student testStudent = new Student(firstName, lastName, null, null);
        System.out.println("Their registered courses: ");


    }

    public static void sortMostStudentsPerClass() {
        Course course = new Course();
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();

    }

}
