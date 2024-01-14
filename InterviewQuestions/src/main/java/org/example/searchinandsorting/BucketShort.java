package org.example.searchinandsorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class BucketShort {




        public static void bucketSort(int[] array, int numBuckets) {
            if (array.length == 0) {
                return;
            }

            // Find the minimum and maximum values in the array
            int minVal = array[0];
            int maxVal = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < minVal) {
                    minVal = array[i];
                } else if (array[i] > maxVal) {
                    maxVal = array[i];
                }
            }

            // Calculate the range of each bucket
            double range = (double) (maxVal - minVal + 1) / numBuckets;

            // Create an array of empty buckets
            ArrayList<Integer>[] buckets = new ArrayList[numBuckets];
            for (int i = 0; i < numBuckets; i++) {
                buckets[i] = new ArrayList<>();
            }

            // Assign each element to its respective bucket based on its value
            for (int i = 0; i < array.length; i++) {
                int bucketIndex = (int) Math.floor((array[i] - minVal) / range);
                buckets[bucketIndex].add(array[i]);
            }

            // Sort each bucket individually
            for (int i = 0; i < numBuckets; i++) {
                Collections.sort(buckets[i]);
            }

            // Concatenate the sorted buckets back into the original array
            int index = 0;
            for (int i = 0; i < numBuckets; i++) {
                for (int j = 0; j < buckets[i].size(); j++) {
                    array[index++] = buckets[i].get(j);
                }
            }
        }

        public static void main(String[] args) {
            int[] array = { 54, 46, 83, 66, 95, 92, 43 };
            int numBuckets = 5;
            bucketSort(array, numBuckets);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }


    /*

    Certainly! Here's the implementation of the Bucket Sort algorithm in Java, along with an explanation of how it works:

Explanation:
1. We define a class named `BucketSort` to encapsulate the code related to the Bucket Sort algorithm.
2. The `bucketSort` method takes an integer array (`array`) and the number of buckets (`numBuckets`) as input and sorts the array in ascending order.
3. First, we find the minimum and maximum values in the array to determine the range of values.
4. We calculate the range of each bucket by dividing the range of values by the number of buckets.
5. Next, we create an array of empty `ArrayList`s to represent the buckets.
6. We iterate through the array and assign each element to its respective bucket based on its value.
7. We then sort each bucket individually using the `Collections.sort` method.
8. After sorting, we concatenate the sorted buckets back into the original array.
9. In the `main` method, we create an array and specify the number of buckets.
10. We call the `bucketSort` method to sort the array using the Bucket Sort algorithm.
11. Finally, we print the sorted array using `Arrays.toString()`.

Bucket Sort is a sorting algorithm that divides the input into a number of buckets,
distributes the elements into these buckets based on their values, sorts each bucket individually,
and concatenates the sorted buckets to obtain the final sorted array. It is often used when the input elements

     */