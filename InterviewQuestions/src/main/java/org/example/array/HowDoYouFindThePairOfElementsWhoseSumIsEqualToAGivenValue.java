package org.example.array;
import java.util.*;
public class HowDoYouFindThePairOfElementsWhoseSumIsEqualToAGivenValue {


    public static void findPair(int[] array, int targetSum) {
        Set<Integer> set = new HashSet<>(); // Create a set to store visited elements
        for (int i = 0; i < array.length; i++) {
            int difference = targetSum - array[i]; // Calculate the difference between targetSum and current element
            if (set.contains(difference)) { // Check if the difference is already in the set
                System.out.println("Pair found: " + array[i] + ", " + difference); // Print the pair
            }
            set.add(array[i]); // Add the current element to the set
        }
    }

    public static void main(String[] args) {
        int[] array = {2, 4, 7, 11, 15, 8}; // Sample array
        int targetSum = 15; // Target sum
        findPair(array, targetSum); // Call findPair() method
    }

}