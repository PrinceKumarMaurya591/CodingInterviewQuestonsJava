package org.example.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class FindTheFirstNonrepeatedElementInAnArrayList18 {




        public static Integer findFirstNonRepeatedElement(List<Integer> numbers) {
            // Create a HashMap to store the frequency of each element
            Map<Integer, Integer> frequencyMap = new HashMap<>();

            // Count the frequency of each element in the list
            for (Integer number : numbers) {
                frequencyMap.put(number, frequencyMap.getOrDefault(number, 0) + 1);
            }

            // Iterate through the list again to find the first non-repeated element
            for (Integer number : numbers) {
                if (frequencyMap.get(number) == 1) {
                    return number;
                }
            }

            // If no non-repeated element found, return null or throw an exception
            return null;
        }

        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(2);
            numbers.add(1);
            numbers.add(4);

            Integer firstNonRepeated = findFirstNonRepeatedElement(numbers);
            System.out.println("First Non-Repeated Element: " + firstNonRepeated);
        }
    }


    /*


    To find the first non-repeated element in an ArrayList, you can iterate through the list and keep track of the frequency of each element using a HashMap. Here's an example implementation in Java:


In this example, we have an ArrayList of integers named `numbers`. The `findFirstNonRepeatedElement` method takes this list as input and returns the first non-repeated element from the list.

Here's how the code works:
1. We create a HashMap called `frequencyMap` to store the frequency of each element in the list. The key of the map represents the element, and the value represents its frequency.
2. We iterate through the list using an enhanced for loop and update the frequency map using `frequencyMap.put()` and `frequencyMap.getOrDefault()` methods.
3. After counting the frequency of each element, we iterate through the list again and check the frequency of each element using `frequencyMap.get()`.
4. If the frequency of an element is equal to 1, we return that element as the first non-repeated element.
5. If no non-repeated element is found, we can return null or throw an exception based on the requirements.

In the example code, the ArrayList `numbers` contains the elements [1, 2, 3, 2, 1, 4]. The `findFirstNonRepeatedElement` method is called, and the first non-repeated element (3) is printed as the output.

This approach has a time complexity of O(n), where n is the size of the input list.

     */
