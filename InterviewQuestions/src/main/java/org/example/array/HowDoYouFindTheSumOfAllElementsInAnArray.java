package org.example.array;

public class HowDoYouFindTheSumOfAllElementsInAnArray {


        public static int findSum(int[] array) {
            int sum = 0; // Initialize the sum variable to 0
            for (int i = 0; i < array.length; i++) {
                sum += array[i]; // Add each element to the sum
            }
            return sum; // Return the final sum
        }

        public static void main(String[] args) {
            int[] array = { 2, 4, 6, 8, 10 }; // Sample array
            int sum = findSum(array); // Call findSum() method
            System.out.println("The sum of all elements in the array is: " + sum);
        }
    }

