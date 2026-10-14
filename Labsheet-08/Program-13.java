
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
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class GenericStudentDetails {
    public static void main(String[] args) {

        Student<Integer, String, Double> s1 =
            new Student<Integer, String, Double>(101, "Amit", 85.5);

        Student<Integer, String, Double> s2 =
            new Student<Integer, String, Double>(102, "Rahul", 90.0);

        Student<Integer, String, Double> s3 =
            new Student<Integer, String, Double>(103, "Priya", 92.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
