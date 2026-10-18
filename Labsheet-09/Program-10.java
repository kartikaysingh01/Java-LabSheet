
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class ListVsSet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        HashSet<Integer> uniqueNumbers = new HashSet<Integer>();

        System.out.print("Enter 5 numbers: ");

        for (int i = 0; i < 5; i++) {
            int number = sc.nextInt();

            numbers.add(number);
            uniqueNumbers.add(number);
        }

        System.out.println("ArrayList: " + numbers);
        System.out.println("HashSet: " + uniqueNumbers);

        sc.close();
    }
}
