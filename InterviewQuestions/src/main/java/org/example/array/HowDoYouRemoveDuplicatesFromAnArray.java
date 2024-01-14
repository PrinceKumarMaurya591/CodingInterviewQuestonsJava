package org.example.array;
import java.util.*;
public class HowDoYouRemoveDuplicatesFromAnArray {



        public static int[] removeDuplicates(int[] array) {
            Set<Integer> set = new HashSet<>(); // Create a Set to store unique elements
            List<Integer> resultList = new ArrayList<>(); // Create an ArrayList to store the result

            for (int i = 0; i < array.length; i++) {
                if (!set.contains(array[i])) { // Check if the element is already present in the set
                    set.add(array[i]); // Add the element to the set
                    resultList.add(array[i]); // Add the element to the result list
                }
            }

            // Convert the ArrayList back to an array
            int[] resultArray = new int[resultList.size()];
            for (int i = 0; i < resultList.size(); i++) {
                resultArray[i] = resultList.get(i);
            }

            return resultArray; // Return the array with duplicates removed
        }

        public static void main(String[] args) {
            int[] array = { 1, 2, 3, 2, 4, 1, 5, 6, 5 }; // Sample array with duplicates
            int[] result = removeDuplicates(array); // Call removeDuplicates() method
            System.out.println("Array with duplicates removed: " + Arrays.toString(result));
        }
    }
