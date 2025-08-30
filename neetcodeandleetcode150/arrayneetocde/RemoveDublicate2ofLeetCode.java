public class RemoveDublicate2ofLeetCode {
    // leetcode 219: Contains Duplicate II
    // Given an integer array nums and an integer k, return true if there are two distinct
    // indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.   
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums.length <= 1 || k <= 0) {
            return false; // No duplicates possible
        }
        Map<Integer, Integer> indexMap = new HashMap<>(); // To store the last index of each number
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                int lastIndex = indexMap.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true; // Found a duplicate within the range
                }
            }
            indexMap.put(nums[i], i); // Update the last index of the number
        }
        return false; // No duplicates found within the range
    }
    // Time Complexity: O(n), where n is the number of elements in the array
    // Space Complexity: O(n), for the HashMap to store indices of elements

       public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println("Contains nearby duplicate: " + result); // Output: true

        int[] nums2 = {1, 0, 1, 1};
        int k2 = 1;
        boolean result2 = containsNearbyDuplicate(nums2, k2);
        System.out.println("Contains nearby duplicate: " + result2); // Output: true

        int[] nums3 = {1, 2, 3, 4};
        int k3 = 2;
        boolean result3 = containsNearbyDuplicate(nums3, k3);
        System.out.println("Contains nearby duplicate: " + result3); // Output: false
       } 
}
