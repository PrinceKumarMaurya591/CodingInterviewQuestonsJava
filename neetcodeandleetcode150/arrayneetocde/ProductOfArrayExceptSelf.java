public class ProductOfArrayExceptSelf {    

    //leetcode 238: Product of Array Except Self
    // Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
    // The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
    // You must write an algorithm that runs in O(n) time and without using the division operation.
    
    // Example:
    // Input: nums = [1,2,3,4]
    // Output: [24,12,8,6]
    // Explanation: The product of all elements except nums[0] is 2*3*4 = 24.
    // The product of all elements except nums[1] is 1*3*4 = 12.
    // The product of all elements except nums[2] is 1*2*4 = 8.
    // The product of all elements except nums[3] is 1*2*3 = 6.
    
    // Approach:
    // 1. Create an output array of the same length as the input array.
    // 2. Initialize the output array with 1's.
    // 3. Calculate the prefix products and store them in the output array.
    // 4. Calculate the suffix products and multiply them with the corresponding prefix products in the
    //    output array.
    // 5. Return the output array.
    

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        // Create an array to hold the result   
        int[] answer = new int[n];
        
        // Initialize the first element of answer
        answer[0] = 1;
        
        // Calculate the prefix products
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Calculate the suffix products and multiply with prefix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        
        return answer;
    }
    // Time Complexity: O(n), where n is the number of elements in the array
    // Space Complexity: O(1), if we do not consider the output array as extra

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.print("Product of array except self: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
        // Output: Product of array except self: 24 12 8 6
    }

}
