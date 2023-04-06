import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
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


}
