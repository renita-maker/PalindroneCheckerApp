public class PalindromeCheckerApp {

        /**
         * Application entry point for UC2.
         *
         * @param args Command-line arguments
         */
        public static void main(String[] args) {

            // Hardcoded string to check
            String word = "madam";

            // Variable to track if word is palindrome
            boolean isPalindrome = true;

            // Length of the string
            int length = word.length();

            // Loop to compare characters from start and end
            for (int i = 0; i < length / 2; i++) {
                if (word.charAt(i) != word.charAt(length - 1 - i)) {
                    isPalindrome = false; // Mismatch found
                    break;
                }
            }

            // Print result to console
            System.out.println("Word to check: " + word);
            if (isPalindrome) {
                System.out.println("Result: The word is a palindrome.");
            } else {
                System.out.println("Result: The word is NOT a palindrome.");
            }
        }
    }