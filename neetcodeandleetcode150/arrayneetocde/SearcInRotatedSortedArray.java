public class SearcInRotatedSortedArray {
    
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int result = search(nums, target);
        System.out.println("Index of target " + target + ": " + result); // Output: Index of target 0: 4
    }


    // Function to search for a target in a rotated sorted array
    // Time Complexity: O(log n), where n is the number of elements in the array

    // Algorithm:
    // 1. Initialize two pointers, left and right, to the start and end of the array.
    // 2. While left is less than or equal to right:
    //    a. Calculate the mid index.
    //    b. If the mid element is equal to the target, return mid.
    //    c. Determine which half of the array is sorted:
    //       - If the left half is sorted:
    //         i. If the target is within the range of the left half, search in the left half.
    //         ii. Otherwise, search in the right half.
    //       - If the right half is sorted:
    //         i. If the target is within the range of the right half, search in the right half.
    //         ii. Otherwise, search in the left half.
    // 3. If the target is not found, return -1.

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the mid element is the target
            if (nums[mid] == target) {
                return mid;
            }

            // Determine which half is sorted
            if (nums[left] <= nums[mid]) { // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // Target is in the left half
                } else {
                    left = mid + 1; // Target is in the right half
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // Target is in the right half
                } else {
                    right = mid - 1; // Target is in the left half
                }
            }
        }
        return -1; // Target not found
    }
}
