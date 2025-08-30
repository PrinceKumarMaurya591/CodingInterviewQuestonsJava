import java.util.*;
// LeetCode 1: Two Sum
// Given an array of integers, return indices of the two numbers such that they add up to

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 1, 1};
        int target = 3;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println(result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found");
        }
    }

    // Find target sum indices using HashMap
    public static int[] twoSum(int[] nums, int target) {
        // Using a HashMap to store the numbers and their indices
        Map<Integer, Integer> map = new HashMap<>();
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number
            // If the complement exists in the map, return the indices
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            // Store the current number and its index in the map
            map.put(nums[i], i);
        }
        return null; // return null if no solution found
    }
}