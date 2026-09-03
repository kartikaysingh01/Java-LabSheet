import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        int sum = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}