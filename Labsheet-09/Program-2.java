
import java.util.ArrayList;

public class MarksList {
    public static void main(String[] args) {

        ArrayList<Integer> marks = new ArrayList<Integer>();

        marks.add(75);
        marks.add(82);
        marks.add(90);
        marks.add(68);
        marks.add(88);

        System.out.println("First Mark: " + marks.get(0));
        System.out.println("Middle Mark: " + marks.get(2));
        System.out.println("Last Mark: " + marks.get(4));
    }
}
