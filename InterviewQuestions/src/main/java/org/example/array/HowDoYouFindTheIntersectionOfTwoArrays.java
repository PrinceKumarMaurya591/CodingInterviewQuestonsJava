package org.example.array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
public class HowDoYouFindTheIntersectionOfTwoArrays {


    public static int[] findIntersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num); // Add all elements from nums1 to set1
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                intersectionList.add(num); // Add common elements to the intersection list
                set1.remove(num); // Remove the element from set1 to avoid duplicates
            }
        }

        int[] intersectionArray = new int[intersectionList.size()];
        for (int i = 0; i < intersectionList.size(); i++) {
            intersectionArray[i] = intersectionList.get(i); // Convert the list to an array
        }

        return intersectionArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1,3};
        int[] nums2 = {2, 2};
        int[] intersection = findIntersection(nums1, nums2);
        System.out.print("Intersection: ");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

}