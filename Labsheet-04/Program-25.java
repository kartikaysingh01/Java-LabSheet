class Factorial {

    static int totalCalls = 0;

    void calculateFactorial(int number) {

        totalCalls++;

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial of " + number + " = " + factorial);
        System.out.println("Total Calls = " + totalCalls);
    }

    public static void main(String[] args) {

        Factorial f = new Factorial();

        f.calculateFactorial(5);
    }
}