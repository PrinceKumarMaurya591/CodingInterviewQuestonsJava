package org.example.searchinandsorting;
import java.util.Arrays;
public class RadixSort {




        public static void radixSort(int[] array) {
            // Find the maximum element to determine the number of digits
            int max = getMax(array);

            // Perform counting sort for every digit from least significant to most significant
            for (int exp = 1; max / exp > 0; exp *= 10) {
                countingSort(array, exp);
            }
        }

        public static int getMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }

        public static void countingSort(int[] array, int exp) {
            int n = array.length;
            int[] output = new int[n];
            int[] count = new int[10];

            Arrays.fill(count, 0);

            // Count the occurrences of each digit in the current exponent
            for (int i = 0; i < n; i++) {
                int digit = (array[i] / exp) % 10;
                count[digit]++;
            }

            // Calculate the cumulative count array
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // Build the output array in sorted order
            for (int i = n - 1; i >= 0; i--) {
                int digit = (array[i] / exp) % 10;
                output[count[digit] - 1] = array[i];
                count[digit]--;
            }

            // Copy the output array to the original array
            for (int i = 0; i < n; i++) {
                array[i] = output[i];
            }
        }

        public static void main(String[] args) {
            int[] array = { 170, 45, 75, 90, 802, 24, 2, 66 };
            radixSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }


    /*

Certainly! Here's the implementation of the Radix Sort algorithm in Java, along with an explanation of each step:


Explanation:
1. We define a class named `RadixSort` to encapsulate the code related to the Radix Sort algorithm.
2. The `radixSort` method takes an integer array (`array`) as input and sorts the array using the Radix Sort algorithm.
3. In the `radixSort` method, we find the maximum element in the array to determine the maximum number of digits among the elements.
4. We use a `for` loop to perform the counting sort for every digit from the least significant to the most significant.
5. The `getMax` method finds the maximum element in the array by iterating through it.
6. The `countingSort` method performs the counting sort for a given digit (`exp`).
7. We create an `output` array to store the sorted elements and a `count` array to count the occurrences of each digit.
8. In the `countingSort` method, we initialize the `count` array with zeros.
9. We iterate through the array and count the occurrences of each digit in the current exponent.
10. Next, we calculate the cumulative count array by adding the counts of each digit.
11. Using a backward loop, we build the `output` array by placing the elements in sorted order based on the current digit.
12. Finally, we copy the elements from the `output` array to the original array.


     */