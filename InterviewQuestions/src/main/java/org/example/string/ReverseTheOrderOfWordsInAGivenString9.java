package org.example.string;

public class ReverseTheOrderOfWordsInAGivenString9 {

        public static String reverseWords(String str) {
            // Trim leading and trailing white spaces
            str = str.trim();

            // Split the string into words
            String[] words = str.split("\\s+");

            // Reverse the array of words
            StringBuilder reversed = new StringBuilder();
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]);
                if (i > 0) {
                    reversed.append(" ");
                }
            }

            // Return the reversed string
            return reversed.toString();
        }

        public static void main(String[] args) {
            String str = "Hello World Java";
            String reversed = reverseWords(str);
            System.out.println("Reversed: " + reversed);
        }
    }


    /*

    To reverse the order of words in a given string, you can follow these steps:

Trim the string: Remove leading and trailing white spaces using the trim() method.
Split the string into words: Use the split() method to split the string into an array of words based on whitespace as the delimiter.
Reverse the array of words: Iterate through the array of words from the end and append each word to a new string, separating them with a space.
Return the reversed string: Return the reversed string as the result.

     */
