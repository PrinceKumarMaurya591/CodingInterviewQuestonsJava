package org.example.collections;

import java.util.ArrayList;
import java.util.HashSet;
public class FindTheIntersectionOfTwoArrayLists4 {



        public static ArrayList<Integer> findIntersection(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            HashSet<Integer> set1 = new HashSet<>(list1);
            ArrayList<Integer> intersection = new ArrayList<>();

            for (Integer num : list2) {
                if (set1.contains(num)) {
                    intersection.add(num);
                    set1.remove(num); // Remove the element to avoid duplicates if present in list2
                }
            }

            return intersection;
        }

        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(3);
            list2.add(4);
            list2.add(5);
            list2.add(6);

            ArrayList<Integer> intersection = findIntersection(list1, list2);
            System.out.println("Intersection: " + intersection);
        }
    }


/*

To find the intersection of two ArrayLists, you can follow the following approach in Java:


Explanation:
1. We define a class named `IntersectionOfArrays` to encapsulate the code related to finding the intersection of two ArrayLists.
2. The `findIntersection` method takes two ArrayLists (`list1` and `list2`) as input and returns an ArrayList containing the intersection of the two lists.
3. We create a HashSet (`set1`) and initialize it with the elements of `list1`. HashSet provides efficient lookup operations.
4. We create an ArrayList (`intersection`) to store the common elements between the two lists.
5. We iterate over each element (`num`) in `list2`.
6. For each element, we check if it exists in `set1` using the `contains` method. If it does, it means it's a common element.
7. We add the common element to the `intersection` ArrayList.
8. To avoid duplicates, we remove the common element from `set1`.
9. After iterating through all the elements in `list2`, we have the intersection stored in the `intersection` ArrayList.
10. We return the `intersection` ArrayList.
11. In the `main` method, we create two ArrayLists (`list1` and `list2`) containing some sample elements.
12. We call the `findIntersection` method, passing `list1` and `list2` as arguments, and store the result in the `intersection` ArrayList.
13. Finally, we print the `intersection` ArrayList.

This code finds the intersection of two ArrayLists by using a HashSet to store the elements of one ArrayList and then iterating through the other ArrayList to find the common elements. The HashSet provides constant-time lookup, making the intersection finding process efficient.

 */