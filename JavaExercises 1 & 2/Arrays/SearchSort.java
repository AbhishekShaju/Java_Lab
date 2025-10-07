import java.util.Scanner;
import java.util.Arrays;

public class SearchSort {
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
        
        // Print original array
        System.out.println("Original array: " + Arrays.toString(arr));
        
        // Sort array (using built-in sort for simplicity)
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        
        // Linear search
        System.out.print("Enter a number to search: ");
        int searchNum = sc.nextInt();
        boolean found = false;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == searchNum) {
                System.out.println("Element found at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("Element not found in the array.");
        }
        
        // Find min and max
        int min = arr[0];
        int max = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        
        sc.close();
    }
}
