
import java.util.Scanner;

public class CalculateFactorial {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Error: Input must be a non-negative integer.");
        } else {
            long factorial = calculateFactorial(num);
            System.out.println("The factorial of " + num + " is " + factorial);
        }
    }

    // Recursive function to compute factorial
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}