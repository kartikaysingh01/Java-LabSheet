import java.util.Scanner;

class RotateBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int rotated = (num << 2) | (num >>> 30);

        System.out.println("Original number = " + num);
        System.out.println("After left rotation by 2 positions = " + rotated);

        sc.close();
    }
}