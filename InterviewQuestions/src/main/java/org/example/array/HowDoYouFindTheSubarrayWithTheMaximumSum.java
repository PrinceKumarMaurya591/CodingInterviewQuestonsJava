package org.example.array;

public class HowDoYouFindTheSubarrayWithTheMaximumSum {


        public static int findMaxSubarraySum(int[] array) {
            int maxSum = array[0]; // Initialize the maximum sum with the first element
            int currentSum = array[0]; // Initialize the current sum with the first element

            for (int i = 1; i < array.length; i++) {
                // Compare the current element with the sum of the current element and the previous subarray
                currentSum = Math.max(array[i], currentSum + array[i]);

                // Update the maximum sum if the current sum is greater
                maxSum = Math.max(maxSum, currentSum);
            }

            return maxSum; // Return the maximum sum
        }

        public static void main(String[] args) {
            int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 }; // Sample array
            int maxSubarraySum = findMaxSubarraySum(array); // Call findMaxSubarraySum() method
            System.out.println("The maximum subarray sum is: " + maxSubarraySum);
        }
    }
