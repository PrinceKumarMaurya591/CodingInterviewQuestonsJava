package org.example.string;

public class WriteAFunctionToReverseAGivenString {


        public static String reverseString(String str) {
            // Convert the string to a character array
            char[] charArray = str.toCharArray();

            // Initialize two pointers, one at the beginning and one at the end of the array
            int left = 0;
            int right = charArray.length - 1;

            // Swap characters from the outer ends towards the middle
            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                // Move the pointers towards the center
                left++;
                right--;
            }

            // Convert the character array back to a string
            return String.valueOf(charArray);
        }

        public static void main(String[] args) {
            String str = "Hello, World!";
            String reversedStr = reverseString(str);
            System.out.println("Reversed string: " + reversedStr);
        }
    }


    /*

    Certainly! Here's a function in Java to reverse a given string:


Explanation:
1. We define a class named `StringReverse` to encapsulate the code related to reversing a string.
2. The `reverseString` method takes a string (`str`) as input and returns the reversed string.
3. We convert the input string to a character array using the `toCharArray()` method.
4. We initialize two pointers, `left` and `right`, with the values 0 and `charArray.length - 1`, respectively.
5. Using a while loop, we swap characters from the outer ends of the array towards the middle.
6. In each iteration, we swap the characters at positions `left` and `right` using a temporary variable.
7. After swapping, we increment `left` and decrement `right` to move the pointers towards the center.
8. This process continues until the `left` pointer becomes greater than or equal to the `right` pointer.
9. Finally, we convert the character array back to a string using `String.valueOf(charArray)` and return the reversed string.
10. In the `main` method, we create a string and call the `reverseString` method to reverse the string.
11. Finally, we print the reversed string.

This implementation reverses a given string by swapping characters from the outer ends towards the middle until the entire string is reversed.

     */
