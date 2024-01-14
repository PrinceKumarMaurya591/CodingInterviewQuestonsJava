package org.example.array;

public class HowDoYouFindTheMaximumElementInAnArray {
    public static int findMax(int[] array) {
        int max = array[0]; // Assume the first element as the maximum
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) { // Compare current element with the current maximum
                max = array[i]; // Update maximum if a greater element is found
            }
        }
        return max; // Return the maximum element
    }

    public static void main(String[] args) {
        int[] array = { 5, 8, 2, 10, 3 }; // Sample array
        int maxElement = findMax(array); // Call findMax() method
        System.out.println("The maximum element in the array is: " + maxElement);
    }
}