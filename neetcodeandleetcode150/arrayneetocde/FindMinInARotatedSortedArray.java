public class FindMinInARotatedSortedArray {
    //leetcode 153: Find Minimum in Rotated Sorted Array
    // Given a rotated sorted array, find the minimum element in it.
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int min = findMin(nums);
        System.out.println("Minimum element in the rotated sorted array: " + min); // Output: 0
    }

    // Function to find the minimum element in a rotated sorted array
    // Time Complexity: O(log n), where n is the number of elements in the array

    //algorithm:
    // 1. Initialize two pointers, left and right, to the start and end of the array.
    // 2. While left is less than right:
    //    a. Calculate the mid index.
    //    b. If the mid element is greater than the rightmost element, it means
    //       the minimum is in the right half, so move left to mid + 1.
    //    c. Otherwise, the minimum is in the left half or at mid, so   
    //       move right to mid.
    

    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the rightmost element,
            // the minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Otherwise, the minimum is in the left half or at mid
                right = mid;
            }
        }
        return nums[left]; // The minimum element is at index 'left'
    }
    
}
