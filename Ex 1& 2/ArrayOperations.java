import java.util.Scanner;
import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        
        // Read array elements
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print array elements
        System.out.println("Array elements: " + Arrays.toString(arr));
        
        // Calculate sum and average
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / n;
        
        System.out.println("Sum of elements: " + sum);
        System.out.printf("Average of elements: %.2f\n", average);
        
        sc.close();
    }
}
