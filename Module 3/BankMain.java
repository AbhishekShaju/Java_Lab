public class BankMain {
    public static void main(String[] args) {
        // Test Savings Account
        System.out.println("=== Savings Account ===");
        SavingsAccount savings = new SavingsAccount("SAV123", "John Doe", 1000);
        System.out.println("Initial balance: $" + savings.getBalance());
        savings.deposit(500);
        System.out.println("Balance after deposit: $" + String.format("%.2f", savings.getBalance()));
        savings.withdraw(200);
        System.out.println("Balance after withdrawal: $" + String.format("%.2f", savings.getBalance()));
        
        System.out.println("\n=== Current Account ===");
        CurrentAccount current = new CurrentAccount("CUR456", "Jane Smith", 2000, 1000);
        System.out.println("Initial balance: $" + current.getBalance());
        System.out.println("Overdraft limit: $" + current.getOverdraftLimit());
        current.withdraw(2500);
        System.out.println("Balance after large withdrawal: $" + current.getBalance());
        current.withdraw(1000); // This should exceed the limit
    }
}
