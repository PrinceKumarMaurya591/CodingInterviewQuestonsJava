package org.example.array;
import java.util.ArrayList;
import java.util.List;
public class HowDoYouFindTheLeadersInAnArray {


	
	
	
	public static void leaders(int[] arr) {
	int leader=arr[arr.length-1];
	System.out.println(arr[arr.length-1]);
	for(int i=arr.length-2;i>=0;i--) {
		if(arr[i]>leader) {
			leader=arr[i];
			System.out.println(leader);
		}
	}
	}

public static void main(String args[]) {
	int[] arr= {1,3,5,9,8,7,3};
	leaders(arr);
}


//        public static List<Integer> findLeaders(int[] array) {
//            List<Integer> leaders = new ArrayList<>();
//            int n = array.length;
//            int maxRight = array[n - 1];
//            leaders.add(maxRight);
//
//            for (int i = n - 2; i >= 0; i--) {
//                if (array[i] > maxRight) {
//                    maxRight = array[i];
//                    leaders.add(maxRight);
//                }
//            }
//
//            return leaders;
//        }
//
//        public static void main(String[] args) {
//            int[] array = { 16, 17, 4, 3, 5, 2 };
//            List<Integer> leaders = findLeaders(array);
//            System.out.println("Leaders in the array are: " + leaders);
//        }
    }
