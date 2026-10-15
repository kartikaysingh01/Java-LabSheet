
import java.util.ArrayList;

public class UpdateStudentName {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        students.add("Amit");
        students.add("Rahul");
        students.add("Priya");
        students.add("Neha");
        students.add("Rohit");

        System.out.println("Original List: " + students);

        students.set(1, "Karan");
        System.out.println("After Updating: " + students);

        students.remove(3);
        System.out.println("After Removing: " + students);
    }
}
