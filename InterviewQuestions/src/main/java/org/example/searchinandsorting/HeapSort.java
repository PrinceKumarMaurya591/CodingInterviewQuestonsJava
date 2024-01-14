package org.example.searchinandsorting;

import java.util.Arrays;

public class HeapSort {

        public void heapSort(int[] array) {
            int n = array.length;

            // Build a max heap
            for (int i = n / 2 - 1; i >= 0; i--) {
                heapify(array, n, i);
            }

            // Extract elements from the heap one by one
            for (int i = n - 1; i > 0; i--) {
                // Swap the root (maximum element) with the last element
                int temp = array[0];
                array[0] = array[i];
                array[i] = temp;

                // Perform heapify on the reduced heap
                heapify(array, i, 0);
            }
        }

        public void heapify(int[] array, int n, int i) {
            int largest = i;    // Initialize largest as root
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;

            // If left child is larger than root
            if (leftChild < n && array[leftChild] > array[largest]) {
                largest = leftChild;
            }

            // If right child is larger than the largest so far
            if (rightChild < n && array[rightChild] > array[largest]) {
                largest = rightChild;
            }

            // If the largest is not the root, swap and heapify the affected subtree
            if (largest != i) {
                int temp = array[i];
                array[i] = array[largest];
                array[largest] = temp;

                // Recursively heapify the affected subtree
                heapify(array, n, largest);
            }
        }

        public static void main(String[] args) {
            int[] array = { 12, 11, 13, 5, 6, 7 };
            HeapSort heapSort = new HeapSort();
            heapSort.heapSort(array);

            System.out.println("Sorted array: " + Arrays.toString(array));
        }
    }




    /*

    Certainly! Here's the implementation of Heap Sort in Java, along with a line-by-line explanation:


Explanation:
1. We define a class named `HeapSort` to encapsulate the code related to the Heap Sort algorithm.
2. The `heapSort` method takes an integer array (`array`) as input and sorts the array in ascending order using the Heap Sort algorithm.
3. The method starts by building a max heap from the input array.
4. In the `for` loop, we start from the middle element of the array (`n/2 - 1`) and perform heapify operations to build the max heap.
5. The `heapify` method is responsible for maintaining the heap property by swapping elements if necessary.
6. It takes an integer array (`array`), the size of the heap (`n`), and the index of the current root node (`i`) as input.
7. Inside the `heapify` method, we compare the root node with its left and right child to find the largest element among them.
8. If the left child is larger than the root, we update the `largest` index.
9. If the right child is larger than the current `largest`, we update the `largest` index again.
10. If the `largest` index is not the same as the root index, we swap the elements at the `largest` and `i` indices and recursively call `heapify` on the affected subtree.
11. After building the max heap, we perform the extraction step. We start from the last element of the array and swap it with the root (maximum element).
12

     */