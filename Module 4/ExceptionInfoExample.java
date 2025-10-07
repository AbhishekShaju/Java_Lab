public class ExceptionInfoExample {
    public static void main(String[] args) {
        try {
            // Intentionally cause an ArithmeticException
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            // Display exception information
            System.out.println("Exception type: " + e.getClass().getName());
            System.out.println("Exception message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
