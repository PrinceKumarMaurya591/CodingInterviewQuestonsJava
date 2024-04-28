//Remove dublicate from array
package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class rough {
    public static int[] intersection(int[] nums1, int[] nums2) {
        // Initialize HashSet to store unique elements of nums1 and result HashSet for intersection
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resultSet = new HashSet<>();
        
        // Add elements of nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }
        
        // Check for intersection by iterating through nums2
        for (int num : nums2) {
            if (set1.contains(num)) {
                resultSet.add(num);
            }
        }
        
        // Convert result HashSet to array
        int[] intersection = new int[resultSet.size()];
        int index = 0;
        for (int num : resultSet) {
            intersection[index++] = num;
        }
        
        return intersection;
    }
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        
        int[] result = intersection(nums1, nums2);
        System.out.print("Intersection of nums1 and nums2: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
