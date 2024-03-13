public class SumofNaturalNumbers {

    public static void main(String[] args) {
        
        int N = 5; // Set the value of 'N' to 5

        
        int sum = addNumbers(N); // Calculate the sum of the first 'N' natural numbers
        
        System.out.println("Sum of the first " + N + " natural numbers = " + sum); //print the Output
    }

    // Recursive method to calculate the sum of natural numbers up to 'num'
    public static int addNumbers(int num) {
       
       
        if (num != 0)
            return num + addNumbers(num - 1);  // if 'num' is not 0, add 'num' to the sum of numbers up to 'num-1'
        else
            return num; // return 0 when 'num' is 0
    }
}