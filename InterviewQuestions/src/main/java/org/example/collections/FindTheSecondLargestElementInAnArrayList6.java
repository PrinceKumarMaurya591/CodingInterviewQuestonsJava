package org.example.collections;
import java.util.ArrayList;
import java.util.Collections;
public class FindTheSecondLargestElementInAnArrayList6 {




        public static int findSecondLargest(ArrayList<Integer> list) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("ArrayList should have at least 2 elements.");
            }

            int firstLargest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : list) {
                if (num > firstLargest) {
                    secondLargest = firstLargest;
                    firstLargest = num;
                } else if (num > secondLargest && num < firstLargest) {
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("There is no second largest element.");
            }

            return secondLargest;
        }

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(2);
            list.add(8);
            list.add(12);
            list.add(1);

            int secondLargest = findSecondLargest(list);
            System.out.println("Second Largest Element: " + secondLargest);
        }
    }


/*

To find the second largest element in an ArrayList, you can follow the following approach in Java:



Explanation:
1. We define a class named `SecondLargestElement` to encapsulate the code related to finding the second largest element.
2. The `findSecondLargest` method takes an ArrayList of integers (`list`) as input and returns the second largest element.
3. We first check if the ArrayList has at least 2 elements. If not, we throw an `IllegalArgumentException`.
4. We initialize two variables `firstLargest` and `secondLargest` to the minimum possible value of an integer.
5. We iterate through each element in the ArrayList using a for-each loop.
6. For each element, we compare it with the current `firstLargest` element.
7. If the element is greater than `firstLargest`, we update `secondLargest` with the value of `firstLargest`, and `firstLargest` with the current element.
8. If the element is not greater than `firstLargest` but greater than `secondLargest`, we update `secondLargest` with the value of the current element.
9. After iterating through all the elements, we check if `secondLargest` is still the minimum value, indicating that there is no second largest element. In such cases, we throw an `IllegalArgumentException`.
10. Finally, we return the value of `secondLargest`.
11. In the `main` method, we create an ArrayList and add some sample elements to it.
12. We call the `findSecondLargest` method to find the second largest element in the ArrayList.
13. Finally, we print the second largest element using `System.out.println()`.

This code efficiently finds the second largest element in an ArrayList by iterating through the elements and keeping track of the largest and second largest values.

 */
