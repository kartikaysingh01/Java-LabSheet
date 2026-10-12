
class Employee<T, U> {
    T id;
    U name;

    Employee(T id, U name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }
}

public class GenericEmployee {
    public static void main(String[] args) {
        Employee<Integer, String> e1 =
            new Employee<Integer, String>(101, "Amit");

        e1.display();
    }
}