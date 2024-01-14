package org.example.array;

public class HowDoYouFindTheMinimumElementInAnArray {


        public static int findMin(int[] array) {
            int min = array[0]; // Assume the first element as the minimum
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) { // Compare current element with the current minimum
                    min = array[i]; // Update minimum if a smaller element is found
                }
            }
            return min; // Return the minimum element
        }

        public static void main(String[] args) {
            int[] array = { 5, 8, 2, 10, 3 }; // Sample array
            int minElement = findMin(array); // Call findMin() method
            System.out.println("The minimum element in the array is: " + minElement);
        }
    }
