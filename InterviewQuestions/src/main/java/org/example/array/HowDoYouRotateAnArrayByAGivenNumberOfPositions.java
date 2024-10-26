package org.example.array;

public class HowDoYouRotateAnArrayByAGivenNumberOfPositions {

	public static void minJumps(int[] arr, int d) {
		int n = arr.length;
		rotate(arr, 0, d - 1);
		rotate(arr, d, n-1);
		rotate(arr, 0, n-1);

	}

	static void rotate(int arr[], int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		start++;
		end--;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
		int d = 3;
		minJumps(arr1, d); // Expected output: 3
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i] + " ");
		}

	}
}
