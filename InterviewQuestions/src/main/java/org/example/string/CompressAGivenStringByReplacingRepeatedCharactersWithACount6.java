package org.example.string;

public class CompressAGivenStringByReplacingRepeatedCharactersWithACount6 {


        public static String compressString(String str) {
            int length = str.length();
            if (length <= 1) {
                return str; // If the string has one character or is empty, return the original string
            }

            StringBuilder compressed = new StringBuilder();
            int count = 1;

            for (int i = 1; i < length; i++) {
                if (str.charAt(i) == str.charAt(i - 1)) {
                    count++; // Increment count if the current character is the same as the previous one
                } else {
                    compressed.append(str.charAt(i - 1)).append(count); // Append the character and its count to the compressed string
                    count = 1; // Reset count for the new character
                }
            }

            // Append the last character and its count
            compressed.append(str.charAt(length - 1)).append(count);

            // Return the compressed string if it is shorter than the original string, otherwise return the original string
            return compressed.length() < length ? compressed.toString() : str;
        }

        public static void main(String[] args) {
            String str = "aabbbccccdd";
            String compressedStr = compressString(str);
            System.out.println("Compressed string: " + compressedStr);
        }
    }


/*

Sure! Here's an example of how you can compress a string by replacing repeated characters with a count in Java:


Explanation:
1. We define a class named `StringCompression` to encapsulate the code related to compressing a string.
2. The `compressString` method takes a string (`str`) as input and returns the compressed string.
3. We first check if the length of the string is 0 or 1. If so, we return the original string since it cannot be compressed.
4. We use a `StringBuilder` called `compressed` to build the compressed string.
5. We initialize a `count` variable to keep track of the number of consecutive occurrences of a character.
6. We iterate over the characters of the string starting from index 1.
7. If the current character is the same as the previous one, we increment the `count`.
8. If the current character is different from the previous one, we append the previous character and its count to the `compressed` string and reset the `count` to 1.
9. After the loop ends, we append the last character of the string and its count to the `compressed` string.
10. Finally, we compare the lengths of the original string and the compressed string. If the compressed string is shorter, we return it; otherwise, we return the original string.
11. In the `main` method, we create a sample string and call the `compressString` method to compress it.
12. We print the compressed string to verify the result.

For example, if the input string is "aabbbccccdd", the compressed string would be "a2b3c4d2". The algorithm counts the consecutive occurrences of each character and replaces them with the character and its count.

 */