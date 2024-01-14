package org.example.string;

public class CountTheOccurrencesOfASpecificCharacterOrSubstringInAGivenString3 {

        public static int countOccurrences(String str, String target) {
            int count = 0;
            int startIndex = 0;

            while (startIndex < str.length()) {
            	// find the index of the `target` string in `str` starting from the `startIndex`.
                int index = str.indexOf(target, startIndex);
//If the `indexOf` method returns a valid index (not -1), it means the `target` was found in the string
                if (index != -1) {
                    count++;
// We increment the `count` and update the `startIndex` to the index of the found occurrence plus the length of the `target` string.
                    startIndex = index + target.length();
                } else {
                    break;
                }
            }

            return count;
        }

        public static void main(String[] args) {
            String str = "Hello, Hello, Hello, World!";
            String target = "Hello";
            int occurrences = countOccurrences(str, target);
            System.out.println("Occurrences of \"" + target + "\": " + occurrences);
        }
    }



    /*

    To count the occurrences of a specific character or substring in a given string, you can use the following Java code:


Explanation: 
1. We define a class named `CountOccurrences` to encapsulate the code for counting occurrences of a specific character or substring.
2. The `countOccurrences` method takes two strings as input: `str` (the given string) and `target` (the character or substring to count occurrences of).
3. We initialize a variable `count` to keep track of the occurrences and `startIndex` to keep track of the starting index for the search.
4. We use a while loop that continues until the `startIndex` reaches the end of the string.
5. Inside the loop, we use the `indexOf` method of the `String` class to find the index of the `target` string in `str` starting from the `startIndex`.
6. If the `indexOf` method returns a valid index (not -1), it means the `target` was found in the string.
7. We increment the `count` and update the `startIndex` to the index of the found occurrence plus the length of the `target` string.
8. If the `indexOf` method returns -1, it means no more occurrences of `target` were found, and we break out of the loop.
9. Finally, we return the `count` of occurrences.
10. In the `main` method, we create a sample string (`str`) and a target string (`target`) to count occurrences of.
11. We call the `countOccurrences` method and store the result in the `occurrences` variable.
12. Finally, we print the number of occurrences using `System.out.println()`.

In this example, we count the occurrences of the string "Hello" in the given string "Hello, Hello, Hello, World!" and display the count as output.

     */