
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorModification {
    public static void main(String[] args) {

        List<String> students = new ArrayList<String>();

        students.add("Amit");
        students.add("Rahul");
        students.add("Priya");
        students.add("Neha");

        System.out.println("Original List: " + students);

        ListIterator<String> iterator = students.listIterator();

        while (iterator.hasNext()) {
            String name = iterator.next();

            if (name.equals("Rahul")) {
                iterator.set("Karan");
            }

            if (name.equals("Priya")) {
                iterator.add("Rohit");
            }
        }

        System.out.println("Modified List: " + students);
    }
}
