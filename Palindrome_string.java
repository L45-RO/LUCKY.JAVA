package javaprograms;
import java.util.Scanner;
public class Palindrome_string {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask for user input
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        // Remove spaces and convert to lowercase for comparison
	        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

	        // Check if the string is a palindrome
	        if (isPalindrome(cleanedInput)) {
	            System.out.println("\"" + input + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + input + "\" is not a palindrome.");
	        }

	        scanner.close();
	    }

	    // Method to check for palindrome
	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false; // Mismatch found
	            }
	            left++;
	            right--;
	        }

	        return true; // No mismatches, it's a palindrome
	    }
	}


