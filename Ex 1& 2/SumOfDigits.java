import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = Math.abs(sc.nextInt()); // Handle negative numbers
        int original = num;
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println("Sum of digits of " + original + " is: " + sum);
        
        sc.close();
    }
}
