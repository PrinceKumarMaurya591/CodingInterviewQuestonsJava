package org.example.string;

import java.util.*;
public class GroupAnArrayOfStringsSuchThatAllAnagramsAreGroupedTogether13 {



        public static List<List<String>> groupAnagrams(String[] strs) {
            // Create a HashMap to store the sorted string as key and its anagrams as value
            Map<String, List<String>> map = new HashMap<>();

            // Iterate through each string in the input array
            for (String str : strs) {
                // Convert the string to a character array and sort it
                char[] charArray = str.toCharArray();
                Arrays.sort(charArray);

                // Convert the sorted character array back to a string
                String sortedStr = String.valueOf(charArray);

                // If the sorted string is already in the map, add the original string to its list of anagrams
                if (map.containsKey(sortedStr)) {
                    map.get(sortedStr).add(str);
                } else {
                    // If the sorted string is not in the map, create a new list and add the original string
                    List<String> list = new ArrayList<>();
                    list.add(str);
                    map.put(sortedStr, list);
                }
            }

            // Return the list of lists containing the grouped anagrams
            return new ArrayList<>(map.values());
        }

        public static void main(String[] args) {
            String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
            List<List<String>> groupedAnagrams = groupAnagrams(strs);

            // Print the grouped anagrams
            for (List<String> anagramGroup : groupedAnagrams) {
                System.out.println(anagramGroup);
            }
        }
    }


/*

To group anagrams together from an array of strings, you can use a HashMap to keep track of the sorted version of each string and its corresponding list of anagrams. Here's the Java code that demonstrates this approach:



Explanation:
1. We define a class named `GroupAnagrams` to encapsulate the code related to grouping anagrams.
2. The `groupAnagrams` method takes an array of strings (`strs`) as input and returns a list of lists containing the grouped anagrams.
3. We create a HashMap (`map`) to store the sorted string as the key and its anagrams as the value.
4. We iterate through each string in the input array using a for-each loop.
5. For each string, we convert it to a character array and sort the array using `Arrays.sort()`.
6. We convert the sorted character array back to a string using `String.valueOf()`.
7. If the sorted string is already present as a key in the map, we add the original string to its corresponding list of anagrams using `map.get(sortedStr).add(str)`.
8. If the sorted string is not present in the map, we create a new list, add the original string to the list, and put it in the map with the sorted string as the key.
9. After iterating through all the strings, the map will contain the grouped anagrams.
10. We return the list of lists (`new ArrayList<>(map.values())`), which contains all the grouped anagrams.
11. In the `main` method, we create an array of strings and call the `groupAnagrams` method to group the anagrams.
12. We then iterate through the grouped anagrams and print each group.

The code uses the property that anagrams have the same sorted representation. By sorting each string and using the sorted version as a key in the HashMap, we can efficiently group the anagrams together.

 */
