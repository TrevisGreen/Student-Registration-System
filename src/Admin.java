import javax.swing.text.html.StyleSheet;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Admin extends User implements AdminInterface, java.io.Serializable {

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

        Course newCourse = new Course(courseName, courseId, maxStudents, currentStudents, null, courseInstructor, sectionNumber, courseLocation);
        crsMain.courseArrayList.add(newCourse);
        return "Course added";
    }

    public static void deleteCourse() {
        // Ask for courseId
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Course Id: ");
        String courseId = input.nextLine();

        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            if(course.getCourseId().equals(courseId)) {
                crsMain.courseArrayList.remove(i);
            }
        }
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

        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            courseIndex = crsMain.courseArrayList.indexOf(crsMain.courseArrayList.get(i));

            if(choice == 1 && courseId.equals(course.getCourseId())) {
                System.out.print("New max amount of students: ");
                int newMax = input2.nextInt();
                crsMain.courseArrayList.get(courseIndex);
                course.setMaxStudents(newMax);
                break;
            }
            if(choice == 2 && courseId.equals(course.getCourseId())) {
                System.out.println("New course instructor: ");
                String newInstructor = input2.nextLine();
                course.setCourseInstructor(newInstructor);
                break;
            }
            if(choice == 3 && courseId.equals(course.getCourseId())) {
                System.out.println("New section number: ");
                int newSection = input2.nextInt();
                course.setCourseSection(newSection);
                break;
            }
            if(choice == 4 && courseId.equals(course.getCourseId())) {
                System.out.println("New course location: ");
                String newLocation = input2.nextLine();
                course.setCourseLocation(newLocation);
                break;
            }
        }
        System.out.println(crsMain.courseArrayList.toString());
    }

    public static void displayInfo() throws IOException {
        Course course = new Course();
        Scanner input = new Scanner(System.in);

        // Ask user for Course Id
        System.out.print("Enter course Id: ");
        String courseId = input.nextLine();

        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            if(course.getCourseId().equals(courseId)) {
                System.out.println(crsMain.courseArrayList.get(i));
            }
        }
    }

    public static void registerStudent() {
        Scanner input = new Scanner(System.in);
        System.out.println("Student First Name: ");
        String firstName = input.nextLine();
        System.out.println("Student Last Name: ");
        String lastName = input.nextLine();
        String userName = null;
        String password = null;

        Student newStudent = new Student(firstName, lastName, userName, password, crsData.courses);
        crsData.students.add(newStudent);
        System.out.println(crsData.students.toString());
    }

    public static void viewCourses() {
        System.out.println(crsMain.courseArrayList.toString());
    }

    public static String fullCourseId = null;
    public static String viewFullCourses() throws IOException {
        Course course = new Course();
        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            if(course.getEnrolledStudents() == course.getMaxStudents()) {
                String courseId = course.getCourseId();
                fullCourseId = courseId;
                System.out.println(courseId);
            }
        }
        return fullCourseId;
    }

    public static void addCourseToFile() throws IOException {
        Course course = new Course();
        try (PrintWriter writer = new PrintWriter(new File("fullCourses.csv"))) {
            StringBuilder stringBuilder = new StringBuilder();
            for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
                course = crsMain.courseArrayList.get(i);
                if(course.getEnrolledStudents() == course.getMaxStudents()) {
                    String courseId = course.getCourseId();
                    stringBuilder.append(courseId);
                }
            }
        }
    }

    public static void studentNamesInCourse() {
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter course Id: ");
        String courseId = input.nextLine();

        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            if(course.getCourseId().equals(courseId)) {
                System.out.println(course.getStudents().toString());
            }
        }
    }

    public static void coursesPerStudent() {
        Course course = new Course();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        String firstName = input.nextLine();

        System.out.println("Enter student last name: ");
        String lastName = input.nextLine();
        String name = firstName = " " + lastName;
        Student testStudent = new Student(firstName, lastName, null, null, null);
        System.out.println("Their registered courses: ");

        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            course = crsMain.courseArrayList.get(i);
            System.out.println(crsData.courses.toString());
        }
    }

    public static void sortMostStudentsPerClass() {
        Course course = new Course();
        ArrayList<Integer> sortedArrayList = new ArrayList<Integer>();
        for(int i = 0; i < crsMain.courseArrayList.size(); i++) {
            sortedArrayList.add(course.enrolledStudents);
            String courseId = course.getCourseId();
        }
        Collections.sort(sortedArrayList, Collections.reverseOrder());
        System.out.println(sortedArrayList.toString());
    }

}
