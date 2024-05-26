package org.example.codingninja.recursion2;

public class ReplaceCharRecursively {
	
//	Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
//
//	Do this recursively.
	
	
	public static String replaceCharacter(String input, char c1, char c2) {
	if(input.isEmpty())return input;
	  char firstChar = input.charAt(0);
	if(firstChar==c1) {
	 return c2+ replaceCharacter(input.substring(1), c1, c2);
	}else {
		return firstChar+replaceCharacter(input.substring(1), c1, c2);
	}
		
	}

	public static void main(String[] args) {
		
		String input="abacd";
		char c1='a';
		char c2='x';
		String result=replaceCharacter(input, c1, c2);
		System.out.println(result);
	}
	
	
}
