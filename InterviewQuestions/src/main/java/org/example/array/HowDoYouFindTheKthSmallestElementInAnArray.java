package org.example.array;

public class   HowDoYouFindTheKthSmallestElementInAnArray {


        public static int findKthSmallest(int[] array, int k) {
            if (array == null || array.length == 0 || k < 1 || k > array.length) {
                throw new IllegalArgumentException("Invalid input");
            }
            return quickSelect(array, 0, array.length - 1, k - 1);
        }

        private static int quickSelect(int[] array, int start, int end, int k) {
            int pivotIndex = partition(array, start, end);

            if (pivotIndex == k) {
                return array[pivotIndex];
            } else if (pivotIndex < k) {
                return quickSelect(array, pivotIndex + 1, end, k);
            } else {
                return quickSelect(array, start, pivotIndex - 1, k);
            }
        }

        private static int partition(int[] array, int start, int end) {
            int pivot = array[end];
            int i = start;

            for (int j = start; j < end; j++) {
                if (array[j] <= pivot) {
                    swap(array, i, j);
                    i++;
                }
            }
            swap(array, i, end);

            return i;
        }

        private static void swap(int[] array, int i, int j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public static void main(String[] args) {
            int[] array = { 5, 8, 2, 10, 3 };
            int k = 3;
            int kthSmallest = findKthSmallest(array, k);
            System.out.println("The kth smallest element in the array is: " + kthSmallest);
        }
    }
