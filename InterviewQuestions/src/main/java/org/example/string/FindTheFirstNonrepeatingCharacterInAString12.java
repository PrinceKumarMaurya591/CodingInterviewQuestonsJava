package org.example.string;


import java.util.HashMap;
public class FindTheFirstNonrepeatingCharacterInAString12 {


        public static char findFirstUniqueChar(String str) {
            // Create a HashMap to store the frequency of each character
            HashMap<Character, Integer> frequencyMap = new HashMap<>();

            // Iterate through the string and update the frequency of each character
            for (char ch : str.toCharArray()) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }

            // Iterate through the string again and find the first character with a frequency of 1
            for (char ch : str.toCharArray()) {
                if (frequencyMap.get(ch) == 1) {
                    return ch;
                }
            }

            // If no unique character is found, return a default value
            return '\0';
        }

        public static void main(String[] args) {
            String str = "abccdeff";
            char firstUniqueChar = findFirstUniqueChar(str);
            System.out.println("First unique character: " + firstUniqueChar);
        }
    }


/*


To find the first non-repeating character in a string, you can follow the following approach:

Create a HashMap to store the frequency of each character in the string.
Iterate through the string and update the frequency of each character in the HashMap.
Iterate through the string again and check the frequency of each character in the HashMap.
Return the first character that has a frequency of 1.

 */