package org.example.array;

import java.util.ArrayList;
import java.util.List;

public class Howdoyoufindthemissingnumberinanarrayofconsecutiveintegers {



        public static List<Integer> findMissingNumbers(int[] array) {
            List<Integer> missingNumbers = new ArrayList<>();
            int n = array.length + 1; // Expected length of the array

            // Calculate the sum of consecutive integers from 1 to n
            int totalSum = (n * (n + 1)) / 2;

            // Calculate the actual sum of the elements in the array
            int actualSum = 0;
            for (int num : array) {
                actualSum += num;
            }

            // Find the missing number(s)
            int missingSum = totalSum - actualSum;
            int currentNum = array[0] - 1; // Initialize currentNum to a number before the first element

            for (int i = 0; i < array.length; i++) {
                int difference = array[i] - currentNum;
                if (difference > 1) {
                    int missingCount = difference - 1;
                    for (int j = 1; j <= missingCount; j++) {
                        missingNumbers.add(currentNum + j);
                    }
                }
                currentNum = array[i];
            }

            return missingNumbers;
        }

        public static void main(String[] args) {
            int[] array = {1, 3, 5, 7, 9}; // Sample array
            List<Integer> missingNumbers = findMissingNumbers(array);
            System.out.println("Missing number(s): " + missingNumbers);
        }
    }
