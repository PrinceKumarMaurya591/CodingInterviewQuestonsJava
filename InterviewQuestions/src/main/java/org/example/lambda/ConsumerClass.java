package org.example.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerClass {

	public static void main(String[] args) {
//		Consumer<Integer> c = t -> System.out.println(t);
//
//		c.accept(10);
		
		
		List<Integer> li = Arrays.asList(1, 2, 3, 4);
		li.stream().forEach(t -> System.out.println(t));
		
	}


}
