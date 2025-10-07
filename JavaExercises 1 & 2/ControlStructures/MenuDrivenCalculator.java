import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int choice;
        
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            
            choice = sc.nextInt();
            
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                
                switch (choice) {
                    case 1:
                        System.out.printf("Result: %.2f\n", num1 + num2);
                        break;
                    case 2:
                        System.out.printf("Result: %.2f\n", num1 - num2);
                        break;
                    case 3:
                        System.out.printf("Result: %.2f\n", num1 * num2);
                        break;
                    case 4:
                        if (num2 != 0) {
                            System.out.printf("Result: %.2f\n", num1 / num2);
                        } else {
                            System.out.println("Error: Division by zero!");
                        }
                        break;
                }
            } else if (choice != 5) {
                System.out.println("Invalid choice! Please try again.");
            }
            
        } while (choice != 5);
        
        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}
