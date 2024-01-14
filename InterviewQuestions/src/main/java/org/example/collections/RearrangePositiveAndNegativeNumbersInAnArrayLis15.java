package org.example.collections;

import java.util.ArrayList;
import java.util.List;
public class RearrangePositiveAndNegativeNumbersInAnArrayLis15 {


    public class RearrangePositiveNegative {
        public static void rearrange(ArrayList<Integer> list) {
            int positiveIndex = 0;
            int negativeIndex = 1;
            int size = list.size();

            while (true) {
                // Find the next positive element
                while (positiveIndex < size && list.get(positiveIndex) >= 0) {
                    positiveIndex += 2;
                }

                // Find the next negative element
                while (negativeIndex < size && list.get(negativeIndex) < 0) {
                    negativeIndex += 2;
                }

                // Check if both positive and negative indices are within bounds
                if (positiveIndex < size && negativeIndex < size) {
                    // Swap the positive and negative elements
                    int temp = list.get(positiveIndex);
                    list.set(positiveIndex, list.get(negativeIndex));
                    list.set(negativeIndex, temp);
                } else {
                    break;
                }
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(-2);
            numbers.add(3);
            numbers.add(-4);
            numbers.add(5);
            numbers.add(-6);

            System.out.println("Before rearrangement: " + numbers);
            rearrange(numbers);
            System.out.println("After rearrangement: " + numbers);
        }
    }

}

    /*

    To rearrange positive and negative numbers in an ArrayList in Java, you can follow the following approach:



Explanation:
1. We define a class named `RearrangePositiveNegative` to encapsulate the code related to rearranging positive and negative numbers in an ArrayList.
2. The `rearrange` method takes an ArrayList of integers (`list`) as input and rearranges the positive and negative numbers in the list.
3. We initialize `positiveIndex` to 0 and `negativeIndex` to 1 to keep track of the indices for positive and negative elements, respectively.
4. We retrieve the size of the list (`size`) to determine the number of elements.
5. We enter a while loop that continues until all positive and negative elements have been rearranged.
6. Inside the while loop, we use two nested while loops to find the next positive and negative elements.
7. The first while loop increments `positiveIndex` by 2 until a positive element is found or until the index goes out of bounds.
8. The second while loop increments `negativeIndex` by 2 until a negative element is found or until the index goes out of bounds.
9. If both positive and negative indices are within bounds, we swap the positive and negative elements in the list.
10. We repeat this process until all positive and negative elements have been rearranged.
11. In the `main` method, we create an ArrayList `numbers` with a sample set of positive and negative numbers.
12. We print the original list using `System.out.println()` before calling the `rearrange` method.
13. We call the `rearrange` method to rearrange the positive and negative numbers in the list.
14. Finally, we print the modified list after rearrangement.

This code rearranges the positive and negative numbers in an ArrayList by iterating through the list and swapping positive and negative elements until all elements are rearranged.
     */