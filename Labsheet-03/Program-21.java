import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        System.out.println("Enter 5 elements:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int first = a[0];

        for (int i = 0; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }

        a[a.length - 1] = first;

        System.out.println("Array after left rotation:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        sc.close();
    }
}