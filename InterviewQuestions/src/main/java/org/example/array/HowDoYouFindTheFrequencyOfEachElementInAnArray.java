
package org.example.array;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class HowDoYouFindTheFrequencyOfEachElementInAnArray {


	  public static String removeDuplicates(String strin) {
          if (strin == null || strin.length() == 0) {
              return null;
          }

          char[] str=strin.toCharArray();
          
          int length = str.length;
//We initialize variables: `length` to store the length of the string and `tail` to keep track of the position where the next unique character should be placed.
          
          int tail = 1;

          for (int i = 1; i < length; i++) {
              int j;
              for (j = 0; j < tail; j++) {
                  if (str[i] == str[j]) {
                      break;
                  }
              }
//If the inner loop completes without finding a duplicate, we copy the character to position `tail` and increment `tail`.
              if (j == tail) {
                  str[tail] = str[i];
                  tail++;
              }
          }

          return new String(str,0,tail);
      }

      public static void main(String[] args) {
          String str = "Hello World";
         
          System.out.println("String with duplicates removed: " +  removeDuplicates(str));
      }
  
    }
