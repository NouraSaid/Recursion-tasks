// Java implementation to count numbers of digits in  input number using Recursion
 
public class CountDigit {
    public static void main(String[] args) {
        int positiveNumber = 12345; // Replace with your positive number

        int count = digitCount(positiveNumber);

        System.out.println("Numbers of digit in " + positiveNumber + " is: " + count);
    }

    // Count the digit using recursion
    public static int digitCount(int number) {
        if (number == 0) {
            return 0; // If the number is 0, it has 0 digits
        }
        return 1 + digitCount(number / 10); 
    }
}}
