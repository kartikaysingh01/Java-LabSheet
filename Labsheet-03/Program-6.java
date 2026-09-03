import java.util.Scanner;

public class CopyArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];
        int[] b = new int[5];

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        System.out.println("Original array:");

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println();

        System.out.println("Copied array:");

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }

        sc.close();
    }
}