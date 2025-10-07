import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to print its multiplication table: ");
        int num = sc.nextInt();
        
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %2d = %2d\n", num, i, num * i);
        }
        
        sc.close();
    }
}
