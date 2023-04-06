import java.io.*;
import java.util.ArrayList;

public abstract class Serialization implements Serializable {
    public static void studentSerialization() {
        ArrayList<Student> serializedStudent = crsData.students;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("StudentList.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(serializedStudent);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Student Serialization Complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void studentDeserialization() {
        ArrayList<Student> deserializedStudent = new ArrayList<Student>();

        try {
            // File input system receives bytes from a file
            FileOutputStream fileOutputStream = new FileOutputStream("StudentList.ser");

            // ObjectInputStream does the deserialization it reconstructs the data into an object
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);

            // Cast as Student, readObject will take the object from ObjectInputStream
            deserializedStudent = (ArrayList<Student>) objectInputStream.readObject();
            objectInputStream.close();
            fileOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            return;
        }
        for(Student studentList : deserializedStudent) {
            System.out.println(studentList);
        }
    }

    public static void courseSerialization() throws IOException {
        ArrayList<Course> serializedCourse = crsMain.courseArrayList;

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("CourseList.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(serializedCourse);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Course Serialization Complete");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
