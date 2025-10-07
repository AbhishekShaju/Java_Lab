import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("Result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            scanner.close();
        }
    }
}
