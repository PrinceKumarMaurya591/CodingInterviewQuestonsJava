package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckIfTwoArrayListsAreEqual3 {



        public static boolean areArrayListsEqual(List<Integer> list1, List<Integer> list2) {
            // Check if the sizes are equal
            if (list1.size() != list2.size()) {
                return false;
            }

            // Check each element in both lists
            for (int i = 0; i < list1.size(); i++) {
                if (!list1.get(i).equals(list2.get(i))) {
                    return false;
                }
            }

            return true;
        }

        public static void main(String[] args) {
            List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
            List<Integer> list3 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 6));

            System.out.println("Are list1 and list2 equal? " + areArrayListsEqual(list1, list2));
            System.out.println("Are list1 and list3 equal? " + areArrayListsEqual(list1, list3));
        }
    }



    /*

    To check if two ArrayLists are equal in Java, you can compare their elements one by one. Here's an example code that demonstrates how to perform this check:


In this example, we have a method `areArrayListsEqual` that takes two `ArrayList` objects as input and returns `true` if they are equal (i.e., contain the same elements in the same order), and `false` otherwise.

The method compares the sizes of the two lists first. If the sizes are different, it immediately returns `false` as the lists cannot be equal. If the sizes are the same, it iterates through each element in both lists and compares them using the `equals` method. If any pair of corresponding elements are not equal, the method returns `false`. If all elements are equal, it returns `true`.

In the `main` method, we create three `ArrayList` objects: `list1`, `list2`, and `list3`. `list1` and `list2` have the same elements, while `list1` and `list3` differ in the last element. We then call the `areArrayListsEqual` method to check their equality and print the results.

The output of this code will be:
```
Are list1 and list2 equal? true
Are list1 and list3 equal? false
```

This example demonstrates how to compare two `ArrayList` objects for equality by checking their sizes and comparing each element.

     */
