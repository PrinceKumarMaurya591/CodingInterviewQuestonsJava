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












import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Convert the array to a HashSet to remove duplicates
        HashSet<Integer> set = new HashSet<>();
        for (int num : array) {
            set.add(num);
        }

        // Convert the HashSet back to an array
        Integer[] uniqueArray = set.toArray(new Integer[0]);

        // Print the result
        System.out.println(Arrays.toString(uniqueArray));
    }
}







import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 5};

        // Use IntStream to remove duplicates
        int[] uniqueArray = Arrays.stream(array)
                                   .distinct()  // Remove duplicates
                                   .toArray();  // Convert back to array

        // Print the result
        System.out.println(Arrays.toString(uniqueArray));
    }
}
