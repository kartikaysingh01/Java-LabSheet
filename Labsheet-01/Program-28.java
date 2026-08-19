import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int digits;

        if (num >= 0 && num <= 9) {
            digits = 1;
        } 
        else if (num >= 10 && num <= 99) {
            digits = 2;
        } 
        else if (num >= 100 && num <= 999) {
            digits = 3;
        } 
        else if (num >= 1000 && num <= 9999) {
            digits = 4;
        } 
        else if (num >= 10000 && num <= 99999) {
            digits = 5;
        } 
        else {
            digits = 0;
        }

        if (digits > 0) {
            System.out.println("Number of digits = " + digits);
        } else {
            System.out.println("Number has more than 5 digits.");
        }

        sc.close();
    }
}