package org.example.array;

public class RemoveDublicateElementFromArray {

	public static void removeDublicate(int[] arr) {
		int length=arr.length;
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[length-1];
					length--;
					j--;
				}
			}
		}
			int[] newArr=new int[length];
			System.arraycopy(arr, 0, newArr, 0, length);
			for(int i:newArr) {
				System.out.println(i);
				}
		
	}
	
	public static void main(String[] args) {
	int[] arr= {3,4,3,2,5,8,2,6,9,1,3};
	removeDublicate(arr);
	
	}
}
