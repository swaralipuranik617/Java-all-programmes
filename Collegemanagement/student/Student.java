package student;

public class Student {
    String name;
    int rollNo;
    String department;

    public Student(String name, int rollNo, String department) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
    }

    public void displayStudent() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
    }
}