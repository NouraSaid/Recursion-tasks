import java.util.ArrayList;

// Fibonacci series 
public class FibonacciSeries {

    // Function to print the fibonacci series
    static Integer fib(Integer n) {
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String args[]) {
        // Given Number N
        Integer N = 5;

        // ArrayList to store the Fibonacci series
        ArrayList<Integer> fibonacciSeries = new ArrayList<>();

        // Print the first N numbers
        for (int i = 0; i <= N; i++) {
            fibonacciSeries.add(fib(i));
        }

        // Print the Fibonacci series
        for (Integer num : fibonacciSeries) {
            System.out.print(num + " ");
        }
    }
}
