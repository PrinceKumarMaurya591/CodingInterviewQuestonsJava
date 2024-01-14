package org.example.searchinandsorting;

public class QuickSort2 {

	
	public static void quickSort(int[] arr,int start,int end) {
		int pivotIndex=partition(arr, start,end);
		if(start<end) {
			quickSort(arr,0, pivotIndex-1);
		
			quickSort(arr, pivotIndex, end);
		}
	}
	public static int partition(int[] arr,int start,int end) {
		int pivot=arr[(start+end)/2];
		while(start<=end) {
			while(arr[start]<pivot) {start++;}
			while(arr[end]>pivot) {end--;}
			if(start<=end) {
				int temp=arr[start];
						arr[start]=arr[end];
						arr[end]=temp;
			}
			start++;
			end--;
		}
		return start;
	}
	public static void printQS(int[] arr) {
    for(int i:arr) {
    	System.out.print(i+" ");
    }
	}
	public static void main(String[] args) {
	int[] arr= {5,8,2,4,9,6,12,13,1};
	int start=0;
	int end=arr.length-1;
	quickSort(arr, start, end);
	printQS(arr);
	}
}