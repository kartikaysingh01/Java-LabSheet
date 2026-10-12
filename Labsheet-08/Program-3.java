
class Student<T> {
    T id;

    Student(T id) {
        this.id = id;
    }

    void display() {
        System.out.println("Student ID: " + id);
    }
}

public class GenericStudent {
    public static void main(String[] args) {
        Student<Integer> s1 = new Student<Integer>(101);

        s1.display();
    }
}