package org.example.collections;

import java.util.ArrayList;
public class CheckIfAnArrayListIsSortedInNondecreasingOrder17 {



        public static boolean isSorted(ArrayList<Integer> list) {
            int size = list.size();
            for (int i = 1; i < size; i++) {
                if (list.get(i) < list.get(i - 1)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            System.out.println("List1 is sorted: " + isSorted(list1));

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(4);
            list2.add(2);
            list2.add(5);
            System.out.println("List2 is sorted: " + isSorted(list2));
        }
    }

/*



To check if an ArrayList is sorted in non-decreasing order (also known as ascending order), you can follow this approach in Java:


Explanation:
1. The `isSorted` method takes an `ArrayList<Integer>` as input and returns a boolean value indicating whether the list is sorted in non-decreasing order or not.
2. We retrieve the size of the list using the `size()` method, which represents the number of elements in the list.
3. We iterate over the list starting from the second element (index 1) up to the last element.
4. In each iteration, we compare the current element (`list.get(i)`) with its previous element (`list.get(i - 1)`).
5. If we find any element that is smaller than its previous element, it means the list is not sorted in non-decreasing order, and we return `false`.
6. If the loop completes without finding any such inconsistency, we return `true`, indicating that the list is sorted.
7. In the `main` method, we create two ArrayLists (`list1` and `list2`) with different elements.
8. We call the `isSorted` method for each list and print the result using `System.out.println()`.

In the provided example, `list1` contains the elements [1, 2, 3], which are in non-decreasing order, so the output will be "List1 is sorted: true". On the other hand, `list2` contains the elements [4, 2, 5], which are not in non-decreasing order, so the output will be "List2 is sorted: false".
 */
