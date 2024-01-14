package org.example.searchinandsorting;

import java.util.Arrays;

public class MergeSort {


        public static void mergeSort(int[] array) {
            if (array.length <= 1) {
                return;
            }
            int mid = array.length / 2;
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];
            System.arraycopy(array, 0, left, 0, left.length);
            System.arraycopy(array, mid, right, 0, right.length);
            mergeSort(left);
            mergeSort(right);
            merge(array, left, right);
        }

        public static void merge(int[] array, int[] left, int[] right) {
            int i = 0, j = 0, k = 0;
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }
            while (i < left.length) {
                array[k++] = left[i++];
            }
            while (j < right.length) {
                array[k++] = right[j++];
            }
        }

        public static void main(String[] args) {
            int[] array = { 5, 2, 8, 12, 1 };
            mergeSort(array);
            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }
