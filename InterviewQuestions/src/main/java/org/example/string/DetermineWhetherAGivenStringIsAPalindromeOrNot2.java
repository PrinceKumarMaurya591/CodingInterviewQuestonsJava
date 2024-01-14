package org.example.string;

public class DetermineWhetherAGivenStringIsAPalindromeOrNot2 {

        public static boolean isPalindrome(String str) {
            int left = 0;
            int right = str.length() - 1;

            // Compare characters from both ends of the string
            while (left < right) {
                // Ignore non-alphanumeric characters from the left
                while (left < right && !Character.isLetterOrDigit(str.charAt(left))) {
                    left++;
                }

                // Ignore non-alphanumeric characters from the right
                while (left < right && !Character.isLetterOrDigit(str.charAt(right))) {
                    right--;
                }

                // Compare the lowercase of the characters
                if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                    return false; // Not a palindrome
                }

                // Move the pointers inward
                left++;
                right--;
            }

            return true; // Palindrome
        }

        public static void main(String[] args) {
            String str = "A man, a plan, a canal: Panama";
            boolean isPal = isPalindrome(str);
            System.out.println("Is the string a palindrome? " + isPal);
        }
    }


    /*

    To determine whether a given string is a palindrome or not, you can follow the steps below:



Explanation:
1. The `isPalindrome` method takes a string (`str`) as input and returns a boolean value indicating whether it is a palindrome or not.
2. We initialize two pointers, `left` and `right`, pointing to the start and end of the string, respectively.
3. The while loop compares characters from both ends of the string until the pointers meet or cross each other.
4. Inside the loop, we ignore non-alphanumeric characters by moving the `left` pointer to the right and the `right` pointer to the left, as long as they haven't crossed each other.
5. We compare the lowercase versions of the characters using `Character.toLowerCase()` to handle case-insensitivity.
6. If a mismatch is found, i.e., the characters are not equal, we return `false`, indicating that the string is not a palindrome.
7. If the loop completes without finding any mismatches, we return `true`, indicating that the string is a palindrome.
8. In the `main` method, we create a sample string and call the `isPalindrome` method to check if it is a palindrome.
9. Finally, we print the result.

The algorithm iterates through the string from both ends, ignoring non-alphanumeric characters, and compares corresponding characters until it reaches the middle. If all comparisons are successful, the string is considered a palindrome.

     */