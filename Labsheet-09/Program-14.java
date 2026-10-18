
import java.util.ArrayList;

public class ArrayListLab {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        students.add("Amit");
        students.add("Rahul");
        students.add("Priya");

        System.out.println("Original List: " + students);

        students.add(1, "Karan");
        System.out.println("After Insertion: " + students);

        students.remove("Rahul");
        System.out.println("After Deletion: " + students);

        System.out.println("Element at Index 1: " + students.get(1));
        System.out.println("List Size: " + students.size());

        System.out.println("Iteration:");
        for (String name : students) {
            System.out.println(name);
        }
    }
}
