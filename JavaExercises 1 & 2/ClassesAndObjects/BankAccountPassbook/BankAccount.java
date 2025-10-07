public class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private static int accountCount = 1000; // Starting account number

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.accountNumber = ++accountCount;
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public Transaction transferTo(BankAccount target, double amount) {
        if (this.withdraw(amount)) {
            target.deposit(amount);
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Success");
        }
        return new Transaction(this.accountNumber, target.accountNumber, amount, "Failed");
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Balance: $%.2f\n", balance);
    }
}
