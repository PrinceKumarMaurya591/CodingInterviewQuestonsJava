package org.example.searchinandsorting;

import java.util.Arrays;

public class ShellShort {

        public static void shellSort(int[] array) {
            int n = array.length;

            // Start with a large gap and reduce it on each iteration
            for (int gap = n / 2; gap > 0; gap /= 2) {
                // Perform insertion sort for elements at each gap
                for (int i = gap; i < n; i++) {
                    int temp = array[i];
                    int j;

                    // Shift elements that are greater than the current element
                    // to their right position within the sorted gap
                    for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                        array[j] = array[j - gap];
                    }

                    // Place the current element in its correct position
                    array[j] = temp;
                }
            }
        }

        public static void main(String[] args) {
            int[] array = { 5, 2, 8, 12, 1 };
            shellSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }



    /*

    Certainly! Here's the implementation of the Shell Sort algorithm in Java, along with an explanation of each step:



Explanation:
1. We define a class named `ShellSort` to encapsulate the code related to the Shell Sort algorithm.
2. The `shellSort` method takes an integer array (`array`) as input and sorts the array in ascending order.
3. The initial gap value is set to `n/2`, where `n` is the length of the array.
4. The algorithm follows the idea of Insertion Sort but with larger gap values.
5. The outer loop controls the gap value, reducing it by half on each iteration until it becomes 1.
6. The inner loop performs insertion sort on elements that are `gap` distance apart.
7. For each gap, the elements are compared and shifted within the sorted gap until the correct position is found.
8. The `j` loop variable starts at `i` and keeps decrementing by `gap` until it reaches the correct position or the beginning of the array.
9. The current element (`temp`) is placed in its correct position after the shifting process.
10. This process is repeated for smaller gap values until the gap becomes 1, resulting in a final Insertion Sort pass.
11. In the `main` method, we create an array and call the `shellSort` method to sort the array.
12. Finally, we print the sorted array using `Arrays.toString()`.

The Shell Sort algorithm improves the time complexity of Insertion Sort by sorting elements that
are far apart first and gradually reducing the gap. This allows elements to move more quickly
towards their correct positions, resulting in an overall faster sorting process.

     */