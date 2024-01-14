package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindTheMedianOfAnArrayListOfIntegers11 {




        public static double findMedian(ArrayList<Integer> nums) {
            // Sort the ArrayList in ascending order
            Collections.sort(nums);

            int size = nums.size();
            if (size % 2 == 0) {
                // Even number of elements
                int middleIndex1 = size / 2;
                int middleIndex2 = middleIndex1 - 1;
                int num1 = nums.get(middleIndex1);
                int num2 = nums.get(middleIndex2);
                return (num1 + num2) / 2.0;
            } else {
                // Odd number of elements
                int middleIndex = size / 2;
                return nums.get(middleIndex);
            }
        }

        public static void main(String[] args) {
            ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5,2,8,12,1));
//            nums.add(5);
//            nums.add(2);
//            nums.add(8);
//            nums.add(12);
//            nums.add(1);

            double median = findMedian(nums);
            System.out.println("Median: " + median);
        }
    }


/*


To find the median of an ArrayList of integers, you can follow the following approach in Java:



Explanation:
1. We define a class named `MedianOfArrayList` to encapsulate the code related to finding the median of an ArrayList.
2. The `findMedian` method takes an ArrayList of integers (`nums`) as input and returns the median as a double value.
3. We use the `Collections.sort()` method to sort the ArrayList in ascending order.
4. We retrieve the size of the ArrayList using `nums.size()`.
5. If the size of the ArrayList is even (i.e., the remainder of `size` divided by 2 is 0), we have to take the average of the two middle elements to calculate the median.
   - We calculate the two middle indices, `middleIndex1` and `middleIndex2`.
   - We retrieve the values at these indices using `nums.get(middleIndex1)` and `nums.get(middleIndex2)`.
   - We calculate the average of these two values using `(num1 + num2) / 2.0` and return it as the median.
6. If the size of the ArrayList is odd, we have a single middle element, which is the median.
   - We calculate the middle index using `size / 2`.
   - We retrieve the value at this index using `nums.get(middleIndex)` and return it as the median.
7. In the `main` method, we create an ArrayList `nums` with some sample values.
8. We call the `findMedian` method, passing the `nums` ArrayList, and store the returned median value in the `median` variable.
9. Finally, we print the median using `System.out.println()`.

This code sorts the ArrayList and finds the median based on its size. If the size is even, it calculates the average of the two middle elements. If the size is odd, it directly returns the middle element as the median.

 */
