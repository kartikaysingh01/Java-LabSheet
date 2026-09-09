class BankAccount {

    int accountNumber;
    double balance;

    static String bankName = "SBI";

    void deposit() {

        double depositAmount = 5000;

        balance = balance + depositAmount;

        System.out.println("Account Number = " + accountNumber);
        System.out.println("Bank = " + bankName);
        System.out.println("Deposited Amount = " + depositAmount);
        System.out.println("Balance = " + balance);
    }

    public static void main(String[] args) {

        BankAccount b = new BankAccount();

        b.accountNumber = 12345;
        b.balance = 10000;

        b.deposit();
    }
}