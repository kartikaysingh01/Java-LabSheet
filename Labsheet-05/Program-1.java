class Student {
    String name;
    int rollNo;
    double marks;

    // Constructor initializes student data
    Student() {
        name = "Kartikay";
        rollNo = 101;
        marks = 85.5;
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name = " + name);
        System.out.println("Roll Number = " + rollNo);
        System.out.println("Marks = " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {

        Student s = new Student();

        s.displayDetails();
    }
}