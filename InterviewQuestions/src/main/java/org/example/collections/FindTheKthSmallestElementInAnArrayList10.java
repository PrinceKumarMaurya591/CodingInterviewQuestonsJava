package org.example.collections;
import java.util.ArrayList;
import java.util.Collections;
public class FindTheKthSmallestElementInAnArrayList10 {





        public static int findKthSmallest(ArrayList<Integer> nums, int k) {
            if (nums == null || nums.isEmpty() || k < 1 || k > nums.size()) {
                throw new IllegalArgumentException("Invalid input");
            }

            // Make a copy of the input list to avoid modifying the original list
            ArrayList<Integer> copy = new ArrayList<>(nums);

            int left = 0;
            int right = copy.size() - 1;

            while (left <= right) {
                int pivotIndex = partition(copy, left, right);

                if (pivotIndex == k - 1) {
                    return copy.get(pivotIndex);
                } else if (pivotIndex > k - 1) {
                    right = pivotIndex - 1;
                } else {
                    left = pivotIndex + 1;
                }
            }

            throw new IllegalArgumentException("Kth smallest element not found");
        }

        private static int partition(ArrayList<Integer> nums, int left, int right) {
            int pivot = nums.get(right);
            int i = left;

            for (int j = left; j < right; j++) {
                if (nums.get(j) <= pivot) {
                    Collections.swap(nums, i, j);
                    i++;
                }
            }

            Collections.swap(nums, i, right);
            return i;
        }

        public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<>();
            nums.add(5);
            nums.add(3);
            nums.add(9);
            nums.add(1);
            nums.add(7);
            int k = 3;

            int kthSmallest = findKthSmallest(nums, k);
            System.out.println("The " + k + "th smallest element is: " + kthSmallest);
        }
    }

/*

To find the kth smallest element in an ArrayList, you can use various approaches. One efficient method is by using the QuickSelect algorithm, which is an optimized version of the QuickSort algorithm. Here's an example implementation in Java:



Explanation:
1. The `findKthSmallest` method takes an ArrayList of integers (`nums`) and an integer `k` as input and returns the kth smallest element.
2. First, we perform some input validation checks to ensure that the input is valid. If any of the conditions fail, an `IllegalArgumentException` is thrown.
3. We make a copy of the input list to avoid modifying the original list. This allows us to perform the QuickSelect algorithm without affecting the original order of the elements.
4. We initialize `left` and `right` pointers to the start and end indices of the sublist that we are considering.
5. We enter a while loop that continues until the `left` pointer is less than or equal to the `right` pointer.
6. Inside the while loop, we call the `partition` method to determine the pivot index, which is the correct position of the pivot element.
7. If the pivot index is equal to `k - 1`, we have found the kth smallest element, so we return it.
8. If the pivot index is greater than `k - 1`, it means the kth smallest element lies in the left sublist, so we update the `right` pointer to `pivotIndex - 1` and continue the search in the left sublist.
9. If the pivot index is less than `k - 1`, it means the kth smallest element lies in the right sublist, so we update the `left` pointer to `pivotIndex + 1` and continue the search in the right sublist.


 */
