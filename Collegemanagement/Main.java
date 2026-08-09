import student.Student;
import faculty.Faculty;

public class Main {
    public static void main(String[] args) {

        Student s = new Student("Swarali", 101, "Computer Science");

        Faculty f = new Faculty(
            "Dr. Akash Sir",
            "F101",
            "Computer Science"
        );

        s.displayStudent();

        System.out.println();

        f.displayFaculty();
    }
}