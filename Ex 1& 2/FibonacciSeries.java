import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            sc.close();
            return;
        }
        
        System.out.print("Fibonacci Series (first " + n + " terms): ");
        
        long first = 0, second = 1;
        
        for (int i = 1; i <= n; i++) {
            System.out.print(first);
            
            if (i < n) {
                System.out.print(", ");
            }
            
            long next = first + second;
            first = second;
            second = next;
        }
        
        System.out.println();
        sc.close();
    }
}
