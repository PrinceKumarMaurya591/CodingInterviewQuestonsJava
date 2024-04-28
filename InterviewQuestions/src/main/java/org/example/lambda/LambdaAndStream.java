package org.example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface InterfaceForLambda {

	int operate(int a, int b);
	
}


public class LambdaAndStream {
public static void main(String[] args)  {
//	// Implementing the MathOperation interface using a lambda expression
//    InterfaceForLambda addition = (int a, int b) -> a + b;
//    
//    // Using the lambda function to perform addition
//    int result = addition.operate(10, 5);
//    System.out.println("Result of addition: " + result);
	
	List<String>lm=Arrays.asList("Alice", "Bob", "Charlie");
	lm.forEach(lms->System.out.println(lms));
	
	
	
	List<String>lst=Arrays.asList("Prince","Kumar","Maurya");
	lst.sort((s1, s2) -> s1.length() - s2.length());
	System.out.println(lst);
	
	
	List<Integer>list=Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	List<Integer>even=list.stream().filter(n -> n%2==0).collect(Collectors.toList());
	System.out.println(even);
}
}
