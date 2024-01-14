package org.example.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Rough {
	
	
	public static void main(String[] args) {
		
		List<Integer> freq=new ArrayList<>(Arrays.asList(1,3,4,3,5,6,7));
		
	System.out.println(findMostFreq(freq));	
	}
	
//most frequency
	public static List<Integer> findMostFreq(List<Integer> freq) {
	
		for(int i=0;i<freq.size();i++) {
			for(int j=i+1;j<freq.size();j++) {
				if(freq.get(i).equals(freq.get(j))) {
					freq.remove(j);
					j--;
				}
			}
		}
		return freq;
		
		
		
	}
	
	
	
}
//class Main{
//
//}
