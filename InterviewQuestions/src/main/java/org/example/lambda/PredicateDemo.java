package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {

	

	
	
	
public static void main(String[] args) {
		
	Predicate<Integer>p=t-> 
		
		(t%2==0)? true: false;
	
	System.out.println(p.test(5));
}
}