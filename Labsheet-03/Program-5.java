import java.util.Scanner;

public class EvenOddCount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] a = new int[5];

        int even = 0;
        int odd = 0;

        System.out.println("Enter 5 integers:");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();

            if (a[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers = " + even);
        System.out.println("Odd numbers = " + odd);

        sc.close();
    }
}