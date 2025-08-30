import java.util.*;

// LeetCode 15: 3Sum
// Given an array of integers, find all unique triplets in the array which gives the sum
public class ThreeSum {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        findTriplets(nums);
        }



    // Function to find all unique triplets that sum to zero with better time complexity
    // Time Complexity: O(n^2), where n is the number of elements in the array
    // Space Complexity: O(n) for storing unique triplets   
    public static void findTriplets(int[] nums) {
        Arrays.sort(nums); // Sort the array to use two-pointer technique
        Set<List<Integer>> result = new HashSet<>(); // To store unique triplets

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for the first element

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    // Skip duplicates for the second element
                    while (left < right && nums[left] == nums[left - 1]) left++;
                    // Skip duplicates for the third element
                    while (left < right && nums[right] == nums[right + 1]) right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        // Print the unique triplets
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}