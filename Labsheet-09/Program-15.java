
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;

public class StudentCollectionSystem {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();
        HashSet<Integer> uniqueIDs = new HashSet<Integer>();
        TreeSet<Integer> sortedIDs = new TreeSet<Integer>();

        // Adding student records
        students.add("101-Amit");
        students.add("103-Rahul");
        students.add("102-Priya");
        students.add("104-Neha");

        uniqueIDs.add(101);
        uniqueIDs.add(103);
        uniqueIDs.add(102);
        uniqueIDs.add(104);
        uniqueIDs.add(101);

        sortedIDs.addAll(uniqueIDs);

        // Displaying records
        System.out.println("Student Records: " + students);
        System.out.println("Unique IDs: " + uniqueIDs);
        System.out.println("Sorted IDs: " + sortedIDs);

        // Searching for a student
        if (students.contains("102-Priya")) {
            System.out.println("Priya is found.");
        } else {
            System.out.println("Priya is not found.");
        }

        // Removing a student
        students.remove("103-Rahul");
        uniqueIDs.remove(103);
        sortedIDs.remove(103);

        System.out.println("After Removal: " + students);

        // Displaying count
        System.out.println("Total Students: " + students.size());

        // Forward traversal
        System.out.println("Forward Traversal:");
        ListIterator<String> iterator = students.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Backward traversal
        System.out.println("Backward Traversal:");

        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }

        // Demonstrating List, Set and SortedSet
        System.out.println("List: " + students);
        System.out.println("Set: " + uniqueIDs);
        System.out.println("Sorted Set: " + sortedIDs);
    }
}
