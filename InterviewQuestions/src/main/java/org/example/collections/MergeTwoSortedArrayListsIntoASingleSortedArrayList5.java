package org.example.collections;
import java.util.ArrayList;
import java.util.List;
public class MergeTwoSortedArrayListsIntoASingleSortedArrayList5 {




        public static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
            List<Integer> mergedList = new ArrayList<>();
            int i = 0;
            int j = 0;

            while (i < list1.size() && j < list2.size()) {
                if (list1.get(i) < list2.get(j)) {
                    mergedList.add(list1.get(i));
                    i++;
                } else {
                    mergedList.add(list2.get(j));
                    j++;
                }
            }

            // Add remaining elements from list1
            while (i < list1.size()) {
                mergedList.add(list1.get(i));
                i++;
            }

            // Add remaining elements from list2
            while (j < list2.size()) {
                mergedList.add(list2.get(j));
                j++;
            }

            return mergedList;
        }

        public static void main(String[] args) {
            List<Integer> list1 = List.of(1, 3, 5, 7);
            List<Integer> list2 = List.of(2, 4, 6, 8);
            List<Integer> mergedList = mergeSortedLists(list1, list2);
            System.out.println("Merged List: " + mergedList);
        }
    }


    /*

    To merge two sorted ArrayLists into a single sorted ArrayList, you can follow the following approach in Java:


Explanation:
1. We define a class named `MergeSortedArrayLists` to encapsulate the code related to merging two sorted ArrayLists.
2. The `mergeSortedLists` method takes two sorted ArrayLists (`list1` and `list2`) as input and returns a new sorted ArrayList containing all elements from both lists.
3. We initialize an empty ArrayList called `mergedList` to store the merged result.
4. We use two pointers `i` and `j` to keep track of the current indices in `list1` and `list2`, respectively.
5. We compare the elements at the current indices (`list1.get(i)` and `list2.get(j)`).
6. If the element from `list1` is smaller, we add it to `mergedList` and increment `i`.
7. If the element from `list2` is smaller or equal, we add it to `mergedList` and increment `j`.
8. We continue this process until we reach the end of either `list1` or `list2`.
9. After exiting the loop, there might be remaining elements in either `list1` or `list2`. We add those remaining elements to `mergedList`.
10. Finally, we return `mergedList`.
11. In the `main` method, we create two sorted ArrayLists (`list1` and `list2`) for demonstration purposes.
12. We call the `mergeSortedLists` method with `list1` and `list2` as arguments and store the result in `mergedList`.
13. Finally, we print the `mergedList` using `System.out.println()`.

The code effectively merges two sorted ArrayLists into a single sorted ArrayList by comparing elements at corresponding indices and adding them to the merged list in the correct order.

     */