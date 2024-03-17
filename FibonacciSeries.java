// Fibonacci series 

class FibonacciSeries {

    // Function to print the fibonacci series
    static int fib(int n)
    {
    
        if (n <= 1)
            return n;

        // Recursive call
        return fib(n - 1) + fib(n - 2);
    }

    
    public static void main(String args[])
    {
        // Given Number N
        int N =5;

        // Print the first N numbers
        for (int i = 0; i <= N; i++) {

            System.out.print(fib(i) + " ");
        }
    }
}