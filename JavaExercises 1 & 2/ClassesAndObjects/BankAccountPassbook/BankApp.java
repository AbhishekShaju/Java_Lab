public class BankApp {
    public static void main(String[] args) {
        // Create two bank accounts
        BankAccount account1 = new BankAccount("John Doe", 1000.0);
        BankAccount account2 = new BankAccount("Jane Smith", 500.0);

        // Display initial account details
        account1.displayAccountDetails();
        account2.displayAccountDetails();

        // Perform a successful transfer
        System.out.println("\nAttempting to transfer $200 from John to Jane...");
        account1.transferTo(account2, 200.0).displayTransaction();

        // Attempt a failed transfer (insufficient funds)
        System.out.println("\nAttempting to transfer $1000 from Jane to John...");
        account2.transferTo(account1, 1000.0).displayTransaction();

        // Display final account details
        System.out.println("\nFinal Account Details:");
        account1.displayAccountDetails();
        account2.displayAccountDetails();
    }
}
