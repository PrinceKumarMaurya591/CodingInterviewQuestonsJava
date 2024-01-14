package org.example.array;

import java.util.Arrays;

public class HowDoYouRotateAnArrayByAGivenNumberOfPositions {


        public static void rotateArray(int[] array, int positions) {
            int length = array.length;

            // Adjust positions if it is greater than array length
            positions = positions % length;

            reverseArray(array, 0, positions - 1); // Reverse first part of the array
            reverseArray(array, positions, length - 1); // Reverse second part of the array
            reverseArray(array, 0, length - 1); // Reverse the entire array
        }

        public static void reverseArray(int[] array, int start, int end) {
            while (start < end) {
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }

        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            int positions = 2;

            System.out.println("Original Array: " + Arrays.toString(array));

            rotateArray(array, positions);

            System.out.println("Rotated Array: " + Arrays.toString(array));
        }
    }
