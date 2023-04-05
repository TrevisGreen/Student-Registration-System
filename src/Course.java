import java.io.Serializable;
import java.util.ArrayList;

public class Course implements Serializable {

    // Default constructor
    public Course() {

    }

    public String courseName;
    public String courseId;
    public int maxStudents;
    public int enrolledStudents;
    public ArrayList<String> students;
    public String courseInstructor;
    public int courseSection;
    public String courseLocation;
    public ArrayList<String> studentCourses;

    // constructor with params
    public Course(String courseName, String courseId, Integer maxStudents, Integer enrolledStudents,
                  ArrayList<String> students, String courseInstructor, Integer courseSection, String courseLocation) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.maxStudents = maxStudents;
        this.enrolledStudents = enrolledStudents;
        this.students = new ArrayList<String>();
        this.courseInstructor = courseInstructor;
        this.courseSection = courseSection;
        this.courseLocation = courseLocation;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        this.maxStudents = maxStudents;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(int enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public String getCourseInstructor() {
        return courseInstructor;
    }

    public void setCourseInstructor(String courseInstructor) {
        this.courseInstructor = courseInstructor;
    }

    public int getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(int courseSection) {
        this.courseSection = courseSection;
    }

    public String getCourseLocation() {
        return courseLocation;
    }

    public void setCourseLocation(String courseLocation) {
        this.courseLocation = courseLocation;
    }

    public ArrayList<String> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(ArrayList<String> studentCourses) {
        this.studentCourses = studentCourses;
    }

    public void addStudentCourses(String courseId) {
        this.studentCourses.add(courseId);
    }

    public void removeStudentCourses(String courseId) {
        this.studentCourses.remove(courseId);
    }

    public void addStudent(String name) {
        this.students.add(name);
        this.enrolledStudents += 1;
    }
    @Override
    public String toString() {
        return this.courseName + " " + this.courseId + " " + this.maxStudents + " " + this.enrolledStudents  + " " + this.students + " " + this.courseInstructor + " " + this.courseSection + " " + this.courseLocation;
    }
}
