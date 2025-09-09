// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
import java.util.*;

class MergeSortedArray{
    public static void main(String[] args) {
       int []nums1 = {1,2,3,0,0,0};
       int m = 3; int[] nums2 = {2,5,6};
       int n = 3;
         int[] result = mergeSortedArray(nums1, m, nums2, n);
         System.out.println(Arrays.toString(result));

    }

    public static int[] mergeSortedArray(int[] nums1, int m, int[] nums2, int n){
        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        // Copy any remaining elements from either array
        while (i < m) {
            merged[k++] = nums1[i++];
        }
        while (j < n) {
            merged[k++] = nums2[j++];
        }

        return merged;
    }



}