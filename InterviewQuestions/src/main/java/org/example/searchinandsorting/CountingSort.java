package org.example.searchinandsorting;

import java.util.Arrays;

public class CountingSort {


        public static void countingSort(int[] array) {
            // Find the maximum element in the array
            int max = findMax(array);

            // Create a count array to store the count of each element
            int[] count = new int[max + 1];

            // Calculate the count of each element
            for (int i = 0; i < array.length; i++) {
                count[array[i]]++;
            }

            // Calculate the cumulative count array
            for (int i = 1; i < count.length; i++) {
                count[i] += count[i - 1];
            }

            // Create a temporary array to store the sorted elements
            int[] sortedArray = new int[array.length];

            // Place the elements in the sorted order using count array
            for (int i = array.length - 1; i >= 0; i--) {
                sortedArray[count[array[i]] - 1] = array[i];
                count[array[i]]--;
            }

            // Copy the sorted array back to the original array
            System.arraycopy(sortedArray, 0, array, 0, array.length);
        }

        public static int findMax(int[] array) {
            int max = Integer.MIN_VALUE;
            for (int num : array) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }

        public static void main(String[] args) {
            int[] array = { 4, 2, 2, 8, 3, 3, 1 };
            countingSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }




/*

Certainly! Here's the implementation of Counting Sort in Java, along with an explanation:



Explanation:
1. The `countingSort` method takes an integer array (`array`) as input and sorts it using Counting Sort.
2. We find the maximum element (`max`) in the array using the `findMax` method.
3. We create a `count` array of size `max + 1` to store the count of each element in the input array.
4. We iterate through the input array and increment the count of each element in the `count` array.
5. Next, we calculate the cumulative count array by adding the current count with the previous count.
   This step helps us determine the correct position of each element in the sorted array.
6. We create a temporary `sortedArray` to store the sorted elements.
7. We iterate through the input array in reverse order and place each element in the sorted order by accessing its count from the `count` array.
8. We decrement the count of the element after placing it in the sorted array.
9. Finally, we copy the elements from the `sortedArray` back to the original `array` using `System.arraycopy`.
10. In the `main` method, we create an array and call the `countingSort` method to sort the array.
11. Finally, we print the sorted array using `Arrays.toString()`.

Counting Sort is a non-comparison based sorting algorithm that works by counting the occurrences of each element and
using that information to determine the sorted order of the elements.
It has a time complexity of O(n + k), where n is the number of elements in the input array and
 k is the range of the elements.


 */