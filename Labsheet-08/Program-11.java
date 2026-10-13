
import java.util.ArrayList;
import java.util.Scanner;

public class SearchGenericList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(60);
        numbers.add(70);
        numbers.add(80);
        numbers.add(90);
        numbers.add(100);

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int num = sc.nextInt();

        if (numbers.contains(num)) {
            System.out.println("Number found in the list.");
        } else {
            System.out.println("Number not found in the list.");
        }

        sc.close();
    }
}
