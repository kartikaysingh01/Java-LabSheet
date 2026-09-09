class Calculator {

    static int operationsCount = 0;

    void add() {
        int a = 10;
        int b = 5;
        int result = a + b;

        operationsCount++;

        System.out.println("Addition = " + result);
    }

    void subtract() {
        int a = 10;
        int b = 5;
        int result = a - b;

        operationsCount++;

        System.out.println("Subtraction = " + result);
    }

    void multiply() {
        int a = 10;
        int b = 5;
        int result = a * b;

        operationsCount++;

        System.out.println("Multiplication = " + result);
    }

    void divide() {
        int a = 10;
        int b = 5;
        int result = a / b;

        operationsCount++;

        System.out.println("Division = " + result);
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();

        c.add();
        c.subtract();
        c.multiply();
        c.divide();

        System.out.println("Total Operations = " + operationsCount);
    }
}