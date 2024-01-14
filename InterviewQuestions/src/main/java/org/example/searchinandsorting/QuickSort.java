package org.example.searchinandsorting;

import java.util.Arrays;

import org.example.string.Rough;

public class QuickSort {


//        public static void quickSort(int[] array, int low, int high) {
//            if (low < high) {
//                int partitionIndex = partition(array, low, high);
//                quickSort(array, low, partitionIndex - 1);
//                quickSort(array, partitionIndex + 1, high);
//            }
//        }
//
//        public static int partition(int[] array, int low, int high) {
//            int pivot = array[high];
//            int i = low - 1;
//            for (int j = low; j < high; j++) {
//                if (array[j] < pivot) {
//                    i++;
//                    swap(array, i, j);
//                }
//            }
//            swap(array, i + 1, high);
//            return i + 1;
//        }
//
//        public static void swap(int[] array, int i, int j) {
//            int temp = array[i];
//            array[i] = array[j];
//            array[j] = temp;
//        }
//
//        public static void main(String[] args) {
//            int[] array = { 5, 2, 8, 12, 1 };
//            int n = array.length;
//            quickSort(array, 0, n - 1);
//            System.out.println("Sorted array: " + Arrays.toString(array));
//        }
//    }






int partition(int[] arr,int low,int high) {
	   int pivot=arr[(low+high)/2];
	   while(low<=high) {
		   while(arr[low]<pivot) {
			   low++;
		   }
		   while(arr[high]>pivot) {
			   high--;
		   }
		   if(low<=high) {
			   int temp=arr[low];
			   arr[low]=arr[high];
			   arr[high]=temp;
		   
		   low++;high--;
	   }}
	   return low;
 
 }
void quickSorts(int[] arr,int low,int high) {
	   int partIndex=partition(arr, low, high);
	   if(low<partIndex-1) {
		   quickSorts(arr, low, partIndex-1);
	   }
	   if(partIndex<high) {
		   quickSorts(arr,partIndex, high);
	   }
}

void printQS(int[] arr) {
	   for(int i:arr)
	   {
		   System.out.print(i+" ");
	   }
}

 public static void main(String[] args) {
    int[] arr= {1,6,3,4,9,8,7};
    int n=arr.length-1;
    QuickSort ru=new QuickSort();
    ru.quickSorts(arr, 0, n);
    ru.printQS(arr);
 }
 }







    /*

    Certainly! Here's the explanation of the provided code line by line:

```java
package org.example.searchinandsorting;

import java.util.Arrays;
```
- The code is placed in the package `org.example.searchinandsorting` and imports the `Arrays` class from the `java.util` package.

```java
public class QuickSort {
```
- Defines a class named `QuickSort` to encapsulate the code related to the Quick Sort algorithm.

```java
public static void quickSort(int[] array, int low, int high) {
    if (low < high) {
        int partitionIndex = partition(array, low, high);
        quickSort(array, low, partitionIndex - 1);
        quickSort(array, partitionIndex + 1, high);
    }
}
```
- Declares a static method `quickSort` that takes an integer array `array`, the lowest index `low`,
 and the highest index `high` as input parameters.
- The method implements the Quick Sort algorithm recursively.
- The base condition `low < high` checks if there are at least two elements to sort.
- It calculates the `partitionIndex` by calling the `partition` method, which determines the correct
position of the pivot element in the array.
- It recursively calls `quickSort` on the left and right sub-arrays to sort them.

```java
public static int partition(int[] array, int low, int high) {
    int pivot = array[high];
    int i = low - 1;
    for (int j = low; j < high; j++) {
        if (array[j] < pivot) {
            i++;
            swap(array, i, j);
        }
    }
    swap(array, i + 1, high);
    return i + 1;
}
```
- Declares a static method `partition` that takes an integer array `array`, the lowest index `low`,
 and the highest index `high` as input parameters.
- It selects the pivot element as the rightmost element (`array[high]`) in the given range.
- Initializes the `i` variable to `low - 1`, which represents the index of the smaller element.
- The `for` loop iterates through the array from `low` to `high-1`.
- If an element is smaller than the pivot, it increments `i` and swaps the elements at indices `i` and `j`.
- After the loop, it places the pivot element at its correct sorted position by swapping it with the element at index `i+1`.
- Returns the index `i+1`, which represents the correct position of the pivot element.

```java
public static void swap(int[] array, int i, int j) {
    int temp = array[i];
    array[i] = array[j];
    array[j] = temp;
}
```
- Declares a static method `swap` that takes an integer array `array`, and two indices `i` and `j` as input parameters.
- It swaps the elements at indices `i` and `j` in the array by using a temporary variable `temp`.

```java
public static void main(String[] args) {
    int[] array = { 5, 2, 8, 12, 1 };
    int n = array.length;
    quickSort(array, 0, n - 1);
    System.out.println("Sorted array: " + Arrays.toString(array));
}
```
- The `main` method is the entry point of the program.
- It creates an integer array `array` with the given values.
- It determines the length of the array using `array.length` and assigns it to the variable `n

     */