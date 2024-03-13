// Java implementation to count the occurrence of a digit in  number using Recursion
 
import java.util.*;
  
class CountDigit{
     
    // Function to count the digit K
    // in the given number N
    static double countdigits(int n, int k)
    {
        if (n == 0)
            return 0;
  
        // Extracting least 
        // significant digit
        int digit = n % 10;
        if (digit == k)
            return 1 + countdigits(n / 10, k);
  
        return countdigits(n / 10, k);
    }
  

    public static void main(String[] args)
    {
        int n = 1000; //set n
        int k = 0; //set k
        System.out.println(countdigits(n, k));
    }
}