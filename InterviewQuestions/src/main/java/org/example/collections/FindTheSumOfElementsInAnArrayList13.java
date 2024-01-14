package org.example.collections;
import java.util.ArrayList;
public class FindTheSumOfElementsInAnArrayList13 {





        public static int calculateSum(ArrayList<Integer> numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }

        public static void main(String[] args) {
            ArrayList<Integer> numbers = new ArrayList<>();
            numbers.add(5);
            numbers.add(10);
            numbers.add(15);
            numbers.add(20);

            int sum = calculateSum(numbers);
            System.out.println("Sum of elements: " + sum);
        }
    }

/*

To find the sum of elements in an ArrayList in Java, you can use the following code:


Explanation:
1. We define a class named `SumOfArrayListElements` to encapsulate the code related to finding the sum of elements in an ArrayList.
2. The `calculateSum` method takes an `ArrayList<Integer>` (`numbers`) as input and returns the sum of its elements.
3. We initialize a variable `sum` to 0 to store the running sum.
4. We iterate through each element (`num`) in the `numbers` ArrayList using an enhanced for loop.
5. In each iteration, we add the current element (`num`) to the `sum`.
6. After iterating through all the elements, we have the sum of all the elements in the `numbers` ArrayList.
7. We return the `sum`.
8. In the `main` method, we create an ArrayList `numbers` and add some sample integers to it.
9. We call the `calculateSum` method, passing the `numbers` ArrayList as an argument, and store the returned sum in the `sum` variable.
10. Finally, we print the sum of the elements using `System.out.println()`.

By iterating through each element of the ArrayList and adding them to the sum, we can calculate the sum of all the elements in the ArrayList.

 */
