package org.example.string;
import java.util.Arrays;
public class CheckIfTwoGivenStringsAreAnagramsOfEachOther4 {




        public static boolean isAnagram(String str1, String str2) {
            // Remove whitespace and convert to lowercase
            str1 = str1.replaceAll("\\s", "").toLowerCase();
            str2 = str2.replaceAll("\\s", "").toLowerCase();

            // Check if lengths are equal
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare sorted arrays for equality
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String str1 = "listen";
            String str2 = "silent";

            if (isAnagram(str1, str2)) {
                System.out.println(str1 + " and " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " and " + str2 + " are not anagrams.");
            }
        }
    }


    /*

    To check if two given strings are anagrams of each other, you can follow the steps below:

1. Remove all whitespace and convert both strings to lowercase (optional, depending on the requirements).
2. Check if the lengths of the two strings are equal. If they are not, they cannot be anagrams.
3. Convert both strings to character arrays for easier manipulation.
4. Sort both character arrays.
5. Compare the sorted character arrays for equality.
   - If they are equal, the strings are anagrams.
   - If they are not equal, the strings are not anagrams.

Here's the Java code implementation of the anagram check algorithm:


```

In this code, we define a class named `AnagramCheck` that encapsulates the anagram check functionality.

The `isAnagram` method takes two strings (`str1` and `str2`) as input and returns a boolean indicating whether they are anagrams.

The method performs the following steps:
1. Remove whitespace and convert both strings to lowercase (optional, depending on the requirements).
2. Check if the lengths of the two strings are equal. If they are not, return `false`.
3. Convert both strings to character arrays for easier manipulation.
4. Sort both character arrays using `Arrays.sort()`.
5. Compare the sorted character arrays for equality using `Arrays.equals()`. If they are equal, return `true`; otherwise, return `false`.

In the `main` method, we test the `isAnagram` function with two example strings, `str1` and `str2`. Depending on the result, we print whether the strings are anagrams or not.

Please note that this implementation considers anagrams to be case-insensitive and disregards whitespace. Feel free to modify the code if you have specific requirements for handling cases or whitespace.

     */