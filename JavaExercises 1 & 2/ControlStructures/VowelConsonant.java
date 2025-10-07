import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a single character: ");
        char ch = sc.next().charAt(0);
        
        // Convert to lowercase to handle both cases
        ch = Character.toLowerCase(ch);
        
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println("Vowel");
            } else {
                System.out.println("Consonant");
            }
        } else {
            System.out.println("Not a valid letter");
        }
        
        sc.close();
    }
}
