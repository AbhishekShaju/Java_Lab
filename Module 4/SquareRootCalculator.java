import java.util.Scanner;

public class SquareRootCalculator {
    public static double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new ArithmeticException("Cannot compute square root of a negative number!");
        }
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        try {
            double input = Double.parseDouble(scanner.nextLine());
            double result = calculateSquareRoot(input);
            System.out.println("Square root is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number!");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
