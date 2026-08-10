package Task3;
public class BankAccount {

    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            return false;
        }

        if (amount > balance) {
            return false;
        }

        balance -= amount;
        return true;
    }

    public boolean deposit(double amount) {

        if (amount <= 0) {
            return false;
        }

        balance += amount;
        return true;
    }
}