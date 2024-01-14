package org.example.array;

public class HowDoYouFindTheAverageOfElementsInAnArray {

        public static double findAverage(int[] array) {
            int sum = 0; // Initialize the sum to 0
            for (int i = 0; i < array.length; i++) {
                sum += array[i]; // Add each element to the sum
            }
            double average = (double) sum / array.length; // Calculate the average
            return average; // Return the average
        }

        public static void main(String[] args) {
            int[] array = { 5, 8, 2, 10, 3 }; // Sample array
            double avg = findAverage(array); // Call findAverage() method
            System.out.println("The average of the elements in the array is: " + avg);
        }
    }
