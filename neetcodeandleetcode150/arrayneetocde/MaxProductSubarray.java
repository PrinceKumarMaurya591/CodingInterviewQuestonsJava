public class MaxProductSubarray {

    //leetcode 152: Maximum Product Subarray
    // Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
    // The problem can be solved using dynamic programming by keeping track of the maximum and minimum products up to each position.    
    // Example:
    // Input: nums = [2,3,-2,4]
    // Output: 6

    //algorithm:
    // 1. Initialize three variables: maxProduct, minProduct, and result to the first element of the array.
    // 2. Iterate through the array starting from the second element.
    // 3. If the current element is negative, swap maxProduct and minProduct.
    // 4. Update maxProduct to be the maximum of the current element and the product of maxProduct and the current element.
    // 5. Update minProduct to be the minimum of the current element and the product of minProduct and the current element.
    // 6. Update result to be the maximum of result and maxProduct.
    // 7. Return result as the maximum product subarray.

    public static void main(String[] args) {
        int[] nums = {2, 3, -2, 4};
        int maxProduct = maxProduct(nums);
        System.out.println("Maximum Product Subarray: " + maxProduct); // Output: 6
    }

    // Function to find the maximum product subarray
    // Time Complexity: O(n), where n is the number of elements in the array
    public static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        // Initialize maxProduct, minProduct, and result with the first element
        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        // Iterate through the array starting from the second element
        // If a negative number is encountered, swap maxProduct and minProduct
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                // Swap max and min when a negative number is encountered
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            // Update maxProduct and minProduct
            // maxProduct is the maximum of the current element or the product of maxProduct and the current element
            // minProduct is the minimum of the current element or the product of minProduct and the current element
            // result is updated to be the maximum of itself and maxProduct
            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);
            result = Math.max(result, maxProduct);
        }

        return result;
    }
    
}
