import java.util.Scanner;

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankWithdrawal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter account balance: ");
            String balanceInput = sc.next();

            System.out.print("Enter withdrawal amount: ");
            String amountInput = sc.next();

            double balance = Double.parseDouble(balanceInput);
            double amount = Double.parseDouble(amountInput);

            if (amount < 0) {
                throw new Exception("Withdrawal amount cannot be negative.");
            }

            if (amount > balance) {
                throw new InsufficientBalanceException(
                    "Insufficient balance."
                );
            }

            balance = balance - amount;

            System.out.println("Withdrawal successful.");
            System.out.println("Remaining balance = " + balance);
        }
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid numeric input.");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Bank transaction completed.");
        }

        sc.close();
    }
}