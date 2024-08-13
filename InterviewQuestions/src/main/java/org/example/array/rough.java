//Remove dublicate from array
package org.example.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class rough {
	   public static void main(String[] args) {
	        int[] arr = {1, -1 ,3, 2 ,-7 ,-5, 11, 6};
	        int n=arr.length;
	      segregateElements(arr,n);
	      
	    }

	   public static void segregateElements(int arr[], int n) {
	        List<Integer>pos=new ArrayList();
	        List<Integer>neg=new ArrayList<>();
	        for(int i=0;i<n;i++){
	            if(arr[i]>=0){
	                pos.add(arr[i]);
	            }else{
	                neg.add(arr[i]);
	            }
	        }
	    pos.addAll(neg);
	    for (int i = 0; i < n; i++) {
            arr[i] = pos.get(i);
        }
	    }
	
}
