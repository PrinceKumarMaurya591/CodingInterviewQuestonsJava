package org.example.codingninja.recursion2;

public class RemoveDublicates {

//	Given a string S, remove consecutive duplicates from it recursively.
	public static String rmbDublicate(String s) {
		if(s.length()<=1)return s;
		if(s.charAt(0)==s.charAt(1))return rmbDublicate(s.substring(1));
		else return s.charAt(0)+rmbDublicate(s.substring(1));
	}
	
	
	
	public static void main(String[] args) {
		String s="aabccba";
		String result=rmbDublicate(s);
		System.out.println(result);
	}
	
}
