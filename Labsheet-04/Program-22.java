class Armstrong {

    static int totalChecks = 0;

    void checkArmstrong(int number) {

        totalChecks++;

        int original = number;
        int sum = 0;

        while (number > 0) {

            int digit = number % 10;
            sum = sum + (digit * digit * digit);
            number = number / 10;
        }

        if (original == sum) {
            System.out.println(original + " is an Armstrong Number");
        } else {
            System.out.println(original + " is not an Armstrong Number");
        }

        System.out.println("Total Checks = " + totalChecks);
    }

    public static void main(String[] args) {

        Armstrong a = new Armstrong();

        a.checkArmstrong(153);
    }
}