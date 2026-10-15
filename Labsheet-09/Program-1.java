
import java.util.ArrayList;

public class StudentList {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        students.add("Amit");
        students.add("Rahul");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");
        students.add("Ankit");
        students.add("Sneha");
        students.add("Vikas");
        students.add("Pooja");
        students.add("Karan");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}
