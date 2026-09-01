class ArmstrongNumbers {
    public static void main(String[] args) {

        System.out.println("Armstrong numbers between 1 and 1000:");

        for (int num = 1; num <= 1000; num++) {
            int n = num;
            int sum = 0;

            while (n > 0) {
                int digit = n % 10;
                sum = sum + (digit * digit * digit);
                n = n / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}