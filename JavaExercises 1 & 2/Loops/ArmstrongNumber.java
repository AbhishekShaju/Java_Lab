import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        
        // Count number of digits
        int digits = 0;
        int temp = number;
        while (temp != 0) {
            temp /= 10;
            digits++;
        }
        
        // Calculate sum of each digit raised to the power of number of digits
        int sum = 0;
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        
        // Check if the number is an Armstrong number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}
