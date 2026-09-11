class PrimeChecker {

    static int totalPrimeChecks = 0;

    void checkPrime(int number) {

        totalPrimeChecks++;

        boolean prime = true;

        if (number <= 1) {
            prime = false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }

        System.out.println("Total Prime Checks = " + totalPrimeChecks);
    }

    public static void main(String[] args) {

        PrimeChecker p = new PrimeChecker();

        p.checkPrime(17);
    }
}