import java.util.Scanner;

public class ReverseWord {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for the word
        System.out.print("Enter a word: ");
        String originalWord = scanner.nextLine();

        // Print the original word
        System.out.print("Original word: ");
        System.out.println(originalWord);

        // Reverse the word using recursion
        String reversedWord = reverseWordRecursive(originalWord);

        // Print the reversed word
        System.out.println("Reversed word: " + reversedWord);
    }

    // Recursive function to reverse a word
    public static String reverseWordRecursive(String word) {
        // an empty string or a string with one character is already reversed
        if (word.length() <= 1) {
            return word;
        }

        //  the substring excluding the first character and concatenate the first character
        return reverseWordRecursive(word.substring(1)) + word.charAt(0);
    }
}