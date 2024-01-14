package org.example.string;

import java.util.HashSet;
public class FindTheLengthOfTheLongestSubstringWithoutRepeatingCharactersInAGivenString8 {



        public static int lengthOfLongestSubstring(String s) {
            int n = s.length();
            int maxLength = 0;
            int i = 0, j = 0;
            HashSet<Character> set = new HashSet<>();

            while (i < n && j < n) {
                if (!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    j++;
                    maxLength = Math.max(maxLength, j - i);
                } else {
                    set.remove(s.charAt(i));
                    i++;
                }
            }

            return maxLength;
        }

        public static void main(String[] args) {
            String s = "abcabcdabcdbb";
            int length = lengthOfLongestSubstring(s);
            System.out.println("Length of the longest substring without repeating characters: " + length);
        }
    }

    /*

    Certainly! Here's an example implementation in Java to find the length of the longest substring without repeating characters in a given string:



Explanation:
1. We define a class named `LongestSubstring` to encapsulate the code related to finding the length of the longest substring without repeating characters.
2. The `lengthOfLongestSubstring` method takes a string `s` as input and returns the length of the longest substring without repeating characters.
3. We initialize variables `i` and `j` to keep track of the start and end indices of the current substring.
4. We also initialize a `HashSet` called `set` to store unique characters encountered in the current substring.
5. We iterate using the `while` loop until both `i` and `j` reach the end of the string `s`.
6. If the current character at index `j` is not present in the `set`, it means it is a unique character. We add it to the `set`, increment `j`, and update the `maxLength` if necessary.
7. If the current character at index `j` is already present in the `set`, it means we have encountered a repeating character. We remove the character at index `i` from the `set`, increment `i`, and continue the process.
8. After the loop ends, we return the `maxLength`, which represents the length of the longest substring without repeating characters.
9. In the `main` method, we provide an example string `"abcabcbb"`.
10. We call the `lengthOfLongestSubstring` method with the given string and store the result in the `length` variable.
11. Finally, we print the length of the longest substring without repeating characters.

The code uses a sliding window approach to find the longest substring without repeating characters. It keeps track of the start and end indices of the current substring and updates the `maxLength` whenever a longer substring is found.

     */

