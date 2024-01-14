package org.example.searchinandsorting;

import java.util.Arrays;

public class InsertionSort {


        public static void insertionSort(int[] array) {
            int n = array.length;
            for (int i = 1; i < n; i++) {
                int key = array[i];
                int j = i - 1;
                while (j >= 0 && array[j] > key) {
                    array[j + 1] = array[j];
                    j--;
                }
                array[j + 1] = key;
            }
        }

        public static void main(String[] args) {
            int[] array = { 5, 2, 8, 12, 1 };
            insertionSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }


/*


Certainly! Here's an explanation of the Insertion Sort algorithm code line by line:


Explanation:
1. The `import java.util.Arrays;` statement imports the `Arrays` class, which provides utility methods for working with arrays,
 including printing arrays as strings.
2. We define a class named `InsertionSort` to encapsulate the code related to the Insertion Sort algorithm.
3. The `insertionSort` method takes an integer array (`array`) as input and sorts the array in ascending order.
4. We retrieve the length of the array (`n`) to determine the number of elements.
5. The outer loop iterates over each element in the array, starting from the second element (index 1).
6. We store the current element (`array[i]`) in a temporary variable called `key`.
7. We initialize a new variable `j` with the value of `i - 1`, representing the previous element's index.
8. We enter a while loop that runs as long as `j` is greater than or equal to 0 and the previous element (`array[j]`) is greater than the `key`.
9. Inside the while loop, we shift elements that are greater than the `key` to the right by assigning `array[j]` to `array[j + 1]`.
10. We decrement `j` by 1 to continue checking previous elements.
11. Once the while loop ends, we have found the correct position for the `key` element, and we assign it to `array[j + 1]`.
12. We repeat this process for each element in the array, effectively sorting the entire array.
13. In the `main` method, we create an array and call the `insertionSort` method to sort the array.
14. Finally, we print the sorted array using `Arrays.toString(array)`.

The Insertion Sort algorithm works by iteratively inserting elements into their correct positions within
 the sorted portion of the array. It starts with the second element and compares it with previous elements,
  shifting them if necessary until the correct position is found.
This process is repeated for each element, resulting in a sorted array.

 */