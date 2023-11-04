package Lab8;

public class Question4 {
    protected static class BankAccount {
        protected int balance;

        BankAccount(int balance) {
            this.balance = balance;
        }

        void deposit(int amount) {
            balance += amount;
        }

        void withdraw(int amount) {
            if (balance - amount >= 0) {
                balance -= amount;
            } else {
                System.out.println("Insufficient Balance!");
            }
        }

        void displayBalance() {
            System.out.println("Balance: " + balance);
        }
    }

    private static class SavingsAccount extends BankAccount {

        SavingsAccount(int balance) {
            super(balance);
        }

        @Override
        void withdraw(int amount) {
            if (balance - amount >= 100) {
                balance -= amount;
            } else {
                System.out.println("Balance less than 100");
            }
        }
    }

    public static void main(String[] args) {
        SavingsAccount acc1 = new SavingsAccount(10000);

        acc1.deposit(100);
        acc1.withdraw(10001);
        acc1.displayBalance();

        acc1.withdraw(1000);
        acc1.displayBalance();
    }
}
