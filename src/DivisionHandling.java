import java.util.Scanner;

public class DivisionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            // Read two integers a and b
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                // Perform division
                int result = a / b;
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Divide by zero error");
        } finally {
            sc.close();
        }
    }
}