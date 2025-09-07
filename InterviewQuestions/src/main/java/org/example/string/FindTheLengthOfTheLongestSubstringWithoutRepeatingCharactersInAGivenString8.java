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




// Sliding Window एल्गोरिदम
// दो pointers रखें: start और end जो substring की शुरुआत और अंत को दिखाएं।
// एक HashMap  जो substring के character frequencies को track करे।
// end pointer को string में आगे बढ़ाएं और आए character की frequency बढ़ाएं।
// अगर किसी character की frequency 1 से ज्यादा हो, तो start pointer को बढ़ाएं और substring के शुरू से characters को हटाएं जब तक duplicate हट न जाए।
// हर step पर substring का length निकालें और maximum length को update करें।

import java.util.HashMap;

public class Solution {
    public String longestSubstringWithoutRepeatingCharacters(String s) {
        int start = 0;   // current window start
        int maxLength = 0;  // max substring length found
        int maxStart = 0;   // start index of max substring
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                // move start to max of current start or last index of this char +1
                start = Math.max(map.get(c) + 1, start);
            }
            map.put(c, end);
            
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
            }
        }
        
        // substring from maxStart with length maxLength
        return s.substring(maxStart, maxStart + maxLength);
    }
    
    public static void main(String[] args) {
        Solution sol = new Solution();
        String input = "abcabcbb";
        System.out.println(sol.longestSubstringWithoutRepeatingCharacters(input));  // Output: "abc"
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

