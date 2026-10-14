
import java.util.ArrayList;

class Student<T, U, V> {
    T id;
    U name;
    V marks;

    Student(T id, U name, V marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        ArrayList<Student<Integer, String, Double>> students =
            new ArrayList<Student<Integer, String, Double>>();

        students.add(new Student<>(101, "Amit", 85.5));
        students.add(new Student<>(102, "Rahul", 90.0));
        students.add(new Student<>(103, "Priya", 92.5));
        students.add(new Student<>(104, "Neha", 88.0));
        students.add(new Student<>(105, "Rohit", 79.5));

        System.out.println("All Students:");
        for (Student<Integer, String, Double> s : students) {
            s.display();
        }

        int searchId = 103;
        boolean found = false;

        System.out.println("\nSearching for Student ID: " + searchId);

        for (Student<Integer, String, Double> s : students) {
            if (s.id.equals(searchId)) {
                s.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        System.out.println("\nTotal Students: " + students.size());

        System.out.println("Type Safety: IDs are Integer, names are String, marks are Double.");
    }
}
