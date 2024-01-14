package org.example.array;

import java.util.Arrays;

public class HowDoYouSegregate0sAnd1sInAnArray {


        public static void segregate(int[] array) {
            int low = 0; // Pointer to track the position of the next 0
            int high = array.length - 1; // Pointer to track the position of the next 1
            int i = 0; // Current pointer for iteration

            while (i <= high) {
                if (array[i] == 0) {
                    // Swap the current element with the element at the low pointer
                    int temp = array[i];
                    array[i] = array[low];
                    array[low] = temp;
                    low++;
                    i++;
                } else if (array[i] == 1) {
                    // Move to the next element
                    i++;
                } else {
                    // Swap the current element with the element at the high pointer
                    int temp = array[i];
                    array[i] = array[high];
                    array[high] = temp;
                    high--;
                }
            }
        }

        public static void main(String[] args) {
            int[] array = { 0, 1, 0, 1, 1, 0, 0, 1 };
            System.out.println("Original array: " + Arrays.toString(array));
            segregate(array);
            System.out.println("Segregated array: " + Arrays.toString(array));
        }
    }
