public class TwoSum2nd {

    // LeetCode 167: Two Sum
    // Given an array of integers, return indices of the two numbers such that they add up to a specific target.

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

    // Time Complexity: O(n), where n is the number of elements in the array
    // Space Complexity: O(n), for the HashMap to store indices of elements

    //Algorithm:
    // 1. Initialize a HashMap to store the numbers and their indices.
    // 2. Iterate through the array:
    //    a. For each number, calculate its complement (target - current number).
    //    b. Check if the complement exists in the HashMap.
    //       - If it does, return the indices of the current number and its complement.
    //       - If it doesn't, store the current number and its index in the HashMap.
    // 3. If no solution is found, return null.

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
