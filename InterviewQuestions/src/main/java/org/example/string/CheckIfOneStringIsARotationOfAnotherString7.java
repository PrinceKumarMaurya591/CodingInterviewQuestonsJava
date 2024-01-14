package org.example.string;

public class CheckIfOneStringIsARotationOfAnotherString7 {

        public static boolean isRotation(String str1, String str2) {
            // Check if lengths of both strings are the same
            if (str1.length() != str2.length()) {
                return false;
            }

            // Concatenate the first string with itself
            String concatenatedStr = str1 + str1;

            // Check if the second string is a substring of the concatenated string
            return concatenatedStr.contains(str2);
        }

        public static void main(String[] args) {
            String str1 = "abcde";
            String str2 = "cdeab";

            if (isRotation(str1, str2)) {
                System.out.println(str2 + " is a rotation of " + str1);
            } else {
                System.out.println(str2 + " is not a rotation of " + str1);
            }
        }
    }


    /*

    To check if one string is a rotation of another string, you can follow these steps:

1. Concatenate the first string with itself. This creates a larger string that contains all possible rotations of the original string. Let's call this concatenated string `concatenatedStr`.
   Example: If the first string is "abc", the `concatenatedStr` would be "abcabc".

2. Check if the second string is a substring of the `concatenatedStr`.
   You can use any string searching algorithm, such as the Knuth-Morris-Pratt (KMP) algorithm or the Rabin-Karp algorithm, to efficiently search for the second string within the `concatenatedStr`.

   In Java, you can simply use the `contains()` method of the `String` class to check if the `concatenatedStr` contains the second string.


```

In the example above, we have the strings "abcde" and "cdeab". Since "cdeab" is a rotation of "abcde", the program will output: "cdeab is a rotation of abcde".

By concatenating the first string with itself, we create a larger string that contains all possible rotations of the original string. Then, by checking if the second string is a substring of the concatenated string, we can determine if it is a rotation of the first string.

     */