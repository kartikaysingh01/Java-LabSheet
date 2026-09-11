class BankAccount {

    double balance;

    static String bankCode = "SBI001";

    void withdraw() {

        double amount = 3000;

        balance = 5000;

        System.out.println("Bank Code = " + bankCode);
        System.out.println("Balance = " + balance);
        System.out.println("Withdrawal Amount = " + amount);

        if (amount <= balance) {

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance = " + balance);

        } else {

            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.withdraw();
    }
}