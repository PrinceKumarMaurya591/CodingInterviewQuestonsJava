package org.example.searchinandsorting;

public class BinarySearchRecursive {


        public static int search(int[] array, int target, int low, int high) {
            if (low <= high) {
                int mid = low + (high - low) / 2;
                if (array[mid] == target) {
                    return mid; // Element found at index mid
                } else if (array[mid] < target) {
                    return search(array, target, mid + 1, high); // Search in the right half
                } else {
                    return search(array, target, low, mid - 1); // Search in the left half
                }
            }
            return -1; // Element not found
        }

        public static void main(String[] args) {
            int[] array = { 1, 2, 3, 5, 8 };
            int target = 5;
            int index = search(array, target, 0, array.length - 1);
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found");
            }
        }
    }
