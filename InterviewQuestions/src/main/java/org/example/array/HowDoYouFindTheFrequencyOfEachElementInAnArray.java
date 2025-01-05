
package org.example.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class HowDoYouFindTheFrequencyOfEachElementInAnArray {


<<<<<<< HEAD

        public static void main(String[] args) {
            int[] array = {1, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5};
    
            // Create a HashMap to store frequencies
            HashMap<Integer, Integer> frequencyMap = new HashMap<>();
    
            // Iterate through the array
            for (int num : array) {
                // If the number is already in the map, increment its count
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
    
            // Print the frequencies
            for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
                System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
            }
        }
=======
	 public static void main(String[] args) {
        // Example array
        int[] arr = {4, 3, 2, 4, 1, 2, 3, 4, 1, 2};

        // Call the method to find the frequency of each element
        findFrequency(arr);
    }

    // Method to find the frequency of each element in the array
    public static void findFrequency(int[] arr) {
        // Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Loop through the array and update the frequency in the map
        for (int num : arr) {
            // If the number is already in the map, increment its count
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + " - Frequency: " + entry.getValue());
        }
    }
  
>>>>>>> 1254db6c48b92ac5962c053aee6b00f0cda2edc2
    }
    