package org.example.searchinandsorting;


    public class LinearSearch {
        public static int search(int[] array, int target) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == target) {
                    return i; // Element found at index i
                }
            }
            return -1; // Element not found
        }

        public static void main(String[] args) {
            int[] array = { 5, 3, 8, 1, 2 };
            int target = 8;
            int index = search(array, target);
            if (index != -1) {
                System.out.println("Element found at index: " + index);
            } else {
                System.out.println("Element not found");
            }
        }
    }
