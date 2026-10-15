
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSearching {
    public static void main(String[] args) {

        ArrayList<String> courses = new ArrayList<String>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C++");
        courses.add("HTML");
        courses.add("Database");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        if (courses.contains(course)) {
            System.out.println("Course found in the list.");
        } else {
            System.out.println("Course not found in the list.");
        }

        sc.close();
    }
}
