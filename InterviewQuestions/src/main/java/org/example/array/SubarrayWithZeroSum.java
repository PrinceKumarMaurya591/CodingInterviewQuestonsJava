package org.example.array;

import java.util.HashSet;

public class SubarrayWithZeroSum {
    public static boolean hasZeroSumSubarray(int[] arr, int n) {
        // Create a HashSet to store prefix sums
        HashSet<Integer> prefixSums = new HashSet<>();
        int sum = 0;

        // Traverse through the array
        for (int num : arr) {
            // Add the current element to the cumulative sum
            sum += num;

            // Check if the cumulative sum is 0 or if it has been seen before
            if (sum == 0 || prefixSums.contains(sum)) {
                return true;
            }

            // Add the cumulative sum to the HashSet
            prefixSums.add(sum);
        }

        // If no subarray with 0 sum is found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int n = arr.length;

        if (hasZeroSumSubarray(arr, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
