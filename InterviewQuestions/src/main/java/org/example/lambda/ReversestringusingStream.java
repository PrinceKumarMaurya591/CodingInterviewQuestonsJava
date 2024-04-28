package org.example.lambda;

	
	import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

	public class ReversestringusingStream {
	    public static void main(String[] args) {
	        String[] names = {"Prince", "Kumar", "Maurya","Khalilabad","Sant" ,"Kabir ","Nagar"};

	        String reversedNames = Arrays.stream(names)
	        		.map(name->{
	        			String[] words=name.split("\\s+");
	        			StringBuilder reversedWord=new StringBuilder();
	        			for(String word:words) {
	        				reversedWord.append(new StringBuilder(word).reverse().append(" "));
	        			}
	        			return reversedWord.toString().trim();
	        		})
	        		
	        		
                    .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            java.util.Collections.reverse(list);
                            return list.stream()
                                       .collect(Collectors.joining(", "));
                        }));

               System.out.println(reversedNames);
	    }
	}

	
	

