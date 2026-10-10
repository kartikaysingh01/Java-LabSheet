class BankAccount {
    int balance = 10000;

    void withdraw(int amount) {
        if (balance >= amount) {
            int temp = balance;
            temp = temp - amount;
            balance = temp;
        }
    }
}

class MyThread extends Thread {
    BankAccount account;

    MyThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class RaceConditionExample {
    public static void main(String[] args) throws InterruptedException {

        BankAccount account = new BankAccount();

        MyThread t1 = new MyThread(account);
        MyThread t2 = new MyThread(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance = " + account.balance);
    }
}