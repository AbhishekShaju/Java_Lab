public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.03; // 3% annual interest

    public SavingsAccount(String accountNumber, String accountHolder, double initialBalance) {
        super(accountNumber, accountHolder, initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: $" + amount);
            addInterest();
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount");
        }
    }

    private void addInterest() {
        double interest = getBalance() * (INTEREST_RATE / 12); // Monthly interest
        setBalance(getBalance() + interest);
        System.out.println("Added interest: $" + String.format("%.2f", interest));
    }
}
