package org.example.string;

public class FindTheLongestPalindromicSubstringInAGivenString11 {

        public static String longestPalindrome(String s) {
            if (s == null || s.length() < 2) {
                return s;
            }

            int start = 0;
            int maxLength = 1;

            for (int i = 0; i < s.length(); i++) {
                // Check for odd-length palindromes
                int len1 = expandAroundCenter(s, i, i);

                // Check for even-length palindromes
                int len2 = expandAroundCenter(s, i, i + 1);

                // Get the maximum length palindrome centered at index i
                int len = Math.max(len1, len2);

                // Update the start index and maximum length if a longer palindrome is found
                if (len > maxLength) {
                    maxLength = len;
                    start = i - (len - 1) / 2;
                }
            }

            // Return the longest palindromic substring
            return s.substring(start, start + maxLength);
        }

        private static int expandAroundCenter(String s, int left, int right) {
            int L = left;
            int R = right;

            while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
                L--;
                R++;
            }

            // Return the length of the palindrome
            return R - L - 1;
        }

        public static void main(String[] args) {
            String s = "babad";
            String longestPalindrome = longestPalindrome(s);
            System.out.println("Longest palindromic substring: " + longestPalindrome);
        }
    }


    /*

    To find the longest palindromic substring in a given string, you can use the following approach:



Explanation:
1. The `longestPalindrome` method takes a string `s` as input and returns the longest palindromic substring within that string.
2. If the input string is `null` or its length is less than 2, the method returns the original string as it is already a palindrome.
3. The variables `start` and `maxLength` keep track of the starting index and length of the longest palindromic substring found so far.
4. The method uses a nested loop to iterate over each character in the string.
5. Within the loop, two calls to the `expandAroundCenter` method are made to check for odd-length and even-length palindromes centered at the current index.
6. The `expandAroundCenter` method expands from the center (or centers for even-length palindromes) and checks if the characters on both sides are equal.
7. The method returns the length of the palindrome found.
8. The maximum length among the odd-length and even-length palindromes is determined using `Math.max`.
9. If a longer palindrome is found, the `start` index and `maxLength` are updated accordingly.
10. After the loop ends, the longest palindromic substring is obtained using the `substring` method and the `start` and `maxLength` values.
11. In the `main` method, a sample string `s` is defined, and the `longestPalindrome` method is called to find the longest palindromic substring.
12. Finally, the result is printed.

The algorithm uses a technique called "Expand Around Center" to find palindromes. It considers each character as the center (or centers) of a potential palindrome and expands outward to check if the characters on both sides are equal. By considering both odd and even-length palindromes, the algorithm efficiently finds the longest

     */
