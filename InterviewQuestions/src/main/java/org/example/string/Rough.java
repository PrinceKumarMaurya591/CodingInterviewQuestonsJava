package org.example.string;

//rotataion
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Stack;

public class Rough {

     public static void main(String[] args) {
    	 String str1 = "Hello, Hello, Hello, World!";
         String target = "Hello";

    	 System.out.println(palidrom(str1,target));
     }
     public static int palidrom(String str1,String target) {
    	int startindex=0;
    	int count=0;
    	while(startindex<str1.length()) {
    		int index=str1.indexOf(target,startindex);
    		if(index!=0) {
    			count++;
    			startindex=index+target.length();
    		}else break;
    	}
    	return count;
     
     }
    }


    /*

    To remove duplicate characters from a string without using additional data structures, you can utilize an in-place algorithm that modifies the given string. Here's an implementation in Java:


```

Explanation:
1. We define a class named `RemoveDuplicates` to encapsulate the code related to removing duplicate characters from a string.
2. The `removeDuplicates` method takes a character array (`str`) as input and modifies it in-place to remove duplicates.
3. We check if the string is null or empty. If so, we return without any modifications.
4. We initialize variables: `length` to store the length of the string and `tail` to keep track of the position where the next unique character should be placed.
5. We iterate through the string starting from the second character (`i = 1`).
6. For each character, we compare it with the characters before `tail` to check for duplicates.
7. If a duplicate is found, we break out of the inner loop.
8. If the inner loop completes without finding a duplicate, we copy the character to position `tail` and increment `tail`.
9. After iterating through the entire string, we set `str[tail]` as the null character (`'\0'`) to null-terminate the modified string.
10. In the `main` method, we create a character array from the given string and call the `removeDuplicates` method.
11. Finally, we print the modified string using `new String(str)`.

The algorithm scans the string and maintains a `tail` pointer to keep track of the unique characters encountered so far.
It checks each character against the characters before `tail` and copies the character to the `tail` position only if it is not a duplicate. The algorithm modifies the string in-place, resulting in a string with duplicate characters removed.


     */