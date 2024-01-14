package org.example.array;

public class HowDoYouFindTheSecondLargestElementInAnArray {


            public static int findSecondLargest(int[] array) {
            int largest = Integer.MIN_VALUE; // Initialize largest as the minimum possible value
            int secondLargest = Integer.MIN_VALUE; // Initialize second largest as the minimum possible value

            for (int i = 0; i < array.length; i++) {
                if (array[i] > largest) {
                    secondLargest = largest; // Update second largest with the previous largest value
                    largest = array[i]; // Update largest with the new maximum value
                } else if (array[i] > secondLargest && array[i] < largest) {
                    secondLargest = array[i]; // Update second largest if a new element is between largest and second largest
                }
            }

            return secondLargest; // Return the second largest element
        }

        public static void main(String[] args) {
            int[] array = { 5, 8, 2, 10, 3 }; // Sample array
            int secondLargestElement = findSecondLargest(array); // Call findSecondLargest() method
            System.out.println("The second largest element in the array is: " + secondLargestElement);
        }
    }
