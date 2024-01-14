package org.example.collections;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class FindTheMostFrequentElementInAnArrayList1 {


        public static int findMostFrequentElement(ArrayList<Integer> list) {
            // Create a HashMap to store the frequency of each element
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            // Iterate over the ArrayList and count the frequency of each element
            for (int element : list) {
                frequencyMap.put(element, frequencyMap.getOrDefault(element, 0) + 1);
            }

            int mostFrequentElement = -1;
            int maxFrequency = 0;

            // Find the element with the highest frequency
            for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                int element = entry.getKey();
                int frequency = entry.getValue();

                if (frequency > maxFrequency) {
                    mostFrequentElement = element;
                    maxFrequency = frequency;
                }
            }

            return mostFrequentElement;
        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(3);
            list.add(2);
            list.add(1);
            list.add(3);
            list.add(3);
            list.add(4);
            list.add(2);

            int mostFrequentElement = findMostFrequentElement(list);
            System.out.println("Most frequent element: " + mostFrequentElement);
        }
    }


    /*

    To find the most frequent element in an ArrayList, you can use the following approach in Java:



Explanation:
1. We define a class named `FindMostFrequentElement` to encapsulate the code related to finding the most frequent element in an ArrayList.
2. The `findMostFrequentElement` method takes an ArrayList of integers (`list`) as input and returns the most frequent element.
3. We create a HashMap named `frequencyMap` to store the frequency of each element in the list. The key of the HashMap represents the element, and the value represents its frequency.
4. We iterate over the ArrayList using a for-each loop and update the frequency map accordingly. If an element is already present in the map, we increment its frequency by 1. If it is not present, we initialize its frequency to 1 using the `getOrDefault` method.
5. We initialize variables `mostFrequentElement` and `maxFrequency` to keep track of the element with the highest frequency and its frequency.
6. Next, we iterate over the entries in the frequency map using a for-each loop. For each entry, we compare its frequency with the current maximum frequency and update `mostFrequentElement` and `maxFrequency` if necessary.
7. Finally, we return the `mostFrequentElement`.
8. In the `main` method, we create an ArrayList `list` and add some elements to it.
9. We call the `findMostFrequentElement` method to find the most frequent element in the list.
10. Finally, we print the result using `System.out.println()`.

In this code, we use a HashMap to count the frequency of each element in the ArrayList. Then, we iterate over the frequency map to find the element with the highest frequency.

     */