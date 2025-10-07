import java.util.Scanner;
import java.util.Arrays;

public class ArrayManipulation {
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
        
        // Count even and odd numbers
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
        
        // Reverse the array
        System.out.print("Original array: " + Arrays.toString(arr));
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
        System.out.println("\nReversed array: " + Arrays.toString(arr));
        
        // Find second largest element
        if (n < 2) {
            System.out.println("Array has less than 2 elements");
        } else {
            // Sort the array in ascending order
            Arrays.sort(arr);
            // The second last element will be the second largest
            System.out.println("Second largest element: " + arr[n - 2]);
        }
        
        // Copy array to another array
        int[] copyArr = new int[n];
        System.arraycopy(arr, 0, copyArr, 0, n);
        System.out.println("Copied array: " + Arrays.toString(copyArr));
        
        sc.close();
    }
}
