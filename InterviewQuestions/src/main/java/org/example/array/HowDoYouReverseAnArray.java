package org.example.array;

import java.util.Arrays;

public class HowDoYouReverseAnArray {

        public static void reverseArray(int[] array) {
            int start = 0; // Initialize start index
            int end = array.length - 1; // Initialize end index

            while (start < end) {
                // Swap elements at start and end indices
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;

                // Move start index towards the end
                start++;

                // Move end index towards the start
                end--;
            }
        }

        public static void main(String[] args) {
            int[] array = { 1, 2, 3, 4, 5 }; // Sample array
            System.out.println("Original array: " + Arrays.toString(array));

            reverseArray(array); // Call reverseArray() method

            System.out.println("Reversed array: " + Arrays.toString(array));
        }
    }
