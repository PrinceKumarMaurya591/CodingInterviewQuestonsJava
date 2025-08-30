public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + maxSum); // Output: 6
    }

    // Function to find the maximum subarray sum using Kadane's algorithm
    // Time Complexity: O(n), where n is the number of elements in the array
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Initialize maxSum with the first element
        int currentSum = nums[0]; // Initialize currentSum with the first element

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]); // Update currentSum
            maxSum = Math.max(maxSum, currentSum); // Update maxSum if currentSum is greater
        }

        return maxSum; // Return the maximum subarray sum
    }
}
