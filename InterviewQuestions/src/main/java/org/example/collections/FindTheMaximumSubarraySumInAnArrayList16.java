package org.example.collections;

import java.util.ArrayList;
public class FindTheMaximumSubarraySumInAnArrayList16 {




        public static int findMaxSubarraySum(ArrayList<Integer> arr) {
            int maxSum = Integer.MIN_VALUE;
            int currentSum = 0;

            for (int i = 0; i < arr.size(); i++) {
                currentSum += arr.get(i);

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }

                if (currentSum < 0) {
                    currentSum = 0;
                }
            }

            return maxSum;
        }

        public static void main(String[] args) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(-2);
            arr.add(1);
            arr.add(-3);
            arr.add(4);
            arr.add(-1);
            arr.add(2);
            arr.add(1);
            arr.add(-5);
            arr.add(4);

            int maxSum = findMaxSubarraySum(arr);
            System.out.println("Maximum Subarray Sum: " + maxSum);
        }
    }

/*

To find the maximum subarray sum in an ArrayList, you can use the Kadane's algorithm. Here's the Java implementation:


Explanation:
1. The `findMaxSubarraySum` method takes an ArrayList of integers (`arr`) as input and returns the maximum subarray sum.
2. We initialize `maxSum` to the minimum possible value (`Integer.MIN_VALUE`) to handle negative subarrays.
3. We also initialize `currentSum` to 0, which keeps track of the sum of the current subarray.
4. We iterate through the elements of the ArrayList using a for loop.
5. In each iteration, we add the current element to `currentSum`.
6. If `currentSum` becomes greater than `maxSum`, we update `maxSum`.
7. If `currentSum` becomes negative, we reset it to 0 because a negative sum will not contribute to the maximum subarray.
8. After iterating through all elements, we return `maxSum`, which represents the maximum subarray sum.
9. In the `main` method, we create an ArrayList `arr` with sample values.
10. We call the `findMaxSubarraySum` method, passing `arr`, and store the result in `maxSum`.
11. Finally, we print the maximum subarray sum using `System.out.println()`.

The Kadane's algorithm works by iteratively scanning the array and keeping track of the current sum. If the current sum becomes negative, it is reset to 0 because a negative sum will only decrease the overall sum. The maximum sum encountered during the scan is updated if necessary. At the end of the iteration, the maximum sum represents the maximum subarray sum.

 */
