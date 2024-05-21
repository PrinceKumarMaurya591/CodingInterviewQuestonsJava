package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfAllNumbers {
	
	public static void main(String[] args) {
		List<Integer> arr=Arrays.asList(2,4,6,8,9);
		int sum=arr.stream().mapToInt(Integer::intValue).reduce(0,(a,b)->a+b);
		System.out.println(sum);
		
			
		}
	}


