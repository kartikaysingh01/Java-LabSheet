
import java.util.ArrayList;

public class GenericListMethod {

    public static <T> void display(ArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Integer List:");
        display(numbers);

        ArrayList<String> names = new ArrayList<String>();
        names.add("Amit");
        names.add("Rahul");
        names.add("Priya");

        System.out.println("String List:");
        display(names);
    }
}
