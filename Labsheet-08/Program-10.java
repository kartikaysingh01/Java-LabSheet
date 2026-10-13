
import java.util.ArrayList;

public class GenericStringList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();

        names.add("Amit");
        names.add("Rahul");
        names.add("Priya");
        names.add("Neha");
        names.add("Rohit");

        System.out.println("Student Names: " + names);

        System.out.println("Name at index 1: " + names.get(1));

        names.set(1, "Karan");
        System.out.println("After set(): " + names);

        names.remove("Priya");
        System.out.println("After remove(): " + names);

        System.out.println("Total Students: " + names.size());
    }
}
