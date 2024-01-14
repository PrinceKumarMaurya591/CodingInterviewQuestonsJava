package org.example.string;

public class CheckIfAGivenStringIsAValidPalindromeConsideringOnlyAlphanumericCharactersAndIgnoringCases15 {


        public static boolean isPalindrome(String s) {
            // Remove non-alphanumeric characters and convert to lowercase
            String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

            // Check if the cleaned string is a palindrome
            int left = 0;
            int right = cleanedString.length() - 1;
            while (left < right) {
                if (cleanedString.charAt(left) != cleanedString.charAt(right)) {
                    return false; // Characters don't match, not a palindrome
                }
                left++;
                right--;
            }
            return true; // All characters match, it is a palindrome
        }

        public static void main(String[] args) {
            String input1 = "A man, a plan, a canal: Panama";
            System.out.println(isPalindrome(input1)); // Output: true

            String input2 = "race a car";
            System.out.println(isPalindrome(input2)); // Output: false
        }
    }


/*

Sure! Here's the code to check if a given string is a valid palindrome, considering only alphanumeric characters and ignoring cases in Java:



Explanation:
1. We define a class named `ValidPalindrome` to encapsulate the code.
2. The `isPalindrome` method takes a string (`s`) as input and returns a boolean indicating whether it is a valid palindrome.
3. We create a cleaned version of the string by removing all non-alphanumeric characters using the `replaceAll` method with a regular expression `[^a-zA-Z0-9]`. This ensures that only alphanumeric characters remain in the cleaned string.
4. We convert the cleaned string to lowercase using the `toLowerCase` method to ignore case while checking for palindromes.
5. We initialize two pointers, `left` and `right`, pointing to the start and end of the cleaned string, respectively.
6. We iterate until the `left` pointer is less than the `right` pointer.
7. At each iteration, we compare the characters at the `left` and `right` positions of the cleaned string.
8. If the characters don't match, it means the string is not a palindrome, and we return `false`.
9. If the characters match, we move the `left` pointer one step forward and the `right` pointer one step backward.
10. After the iteration, if all characters match, we return `true` indicating that the string is a valid palindrome.
11. In the `main` method, we test the `isPalindrome` method with two example strings and print the results.

The code checks if a given string is a valid palindrome by removing non-alphanumeric characters, converting to lowercase, and then comparing characters from both ends of the cleaned string.

 */
