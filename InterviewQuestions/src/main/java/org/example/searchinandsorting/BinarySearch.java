package org.example.searchinandsorting;

public class BinarySearch {

        public static int search(int[] array, int target) {
            int low = 0;
            int high = array.length - 1;

            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (array[mid] == target) {
                    return mid; // Element found at index mid
                } else if (array[mid] < target) {
                    low = mid + 1; // Discard the left half
                } else {
                    high = mid - 1; // Discard the right half
                }
            }
            return -1; // Element not found
        }

        public static void main(String[] args) {
            int[] array = { 1, 2, 3, 5, 8 };
            int target = 5;
            int index = search(array, target);
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found");
            }
        }
    }
