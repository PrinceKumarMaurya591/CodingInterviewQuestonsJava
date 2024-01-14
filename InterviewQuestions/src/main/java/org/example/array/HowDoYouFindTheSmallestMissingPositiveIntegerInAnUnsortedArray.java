package org.example.array;

public class HowDoYouFindTheSmallestMissingPositiveIntegerInAnUnsortedArray {


        public static int findSmallestMissingPositive(int[] array) {
            int n = array.length;

            // Step 1: Move all positive numbers to the left side of the array
            int positiveIndex = 0;
            for (int i = 0; i < n; i++) {
                if (array[i] > 0) {
                    swap(array, i, positiveIndex);
                    positiveIndex++;
                }
            }

            // Step 2: Mark elements as visited
            for (int i = 0; i < positiveIndex; i++) {
                int num = Math.abs(array[i]);
                if (num <= positiveIndex) {
                    int index = num - 1;
                    if (array[index] > 0) {
                        array[index] = -array[index];
                    }
                }
            }

            // Step 3: Find the first positive number
            for (int i = 0; i < positiveIndex; i++) {
                if (array[i] > 0) {
                    return i + 1; // Smallest missing positive integer found
                }
            }

            // Step 4: All numbers from 1 to positiveIndex are present, so return positiveIndex + 1
            return positiveIndex + 1;
        }

        private static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void main(String[] args) {
            int[] array = { 3, 1, -1, 5, 2, 4 }; // Sample array
            int smallestMissingPositive = findSmallestMissingPositive(array);
            System.out.println("The smallest missing positive integer is: " + smallestMissingPositive);
        }
    }
