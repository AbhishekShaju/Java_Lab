public class FibonacciExplorer {
    private static int callCount = 0;

    public static int fibonacci(int n) {
        callCount++;
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 8; // You can change this value
        System.out.println("First " + n + " Fibonacci numbers:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        
        System.out.println("\nTotal recursive calls: " + callCount);
    }
}
