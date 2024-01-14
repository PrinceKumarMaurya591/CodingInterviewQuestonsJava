package org.example.collections;
import java.util.ArrayList;
import java.util.List;
public class CheckIfAnArrayListIsAPalindrome14 {




        public static boolean isPalindrome(List<Integer> list) {
            int start = 0;
            int end = list.size() - 1;

            while (start < end) {
                if (!list.get(start).equals(list.get(end))) {
                    return false;
                }
                start++;
                end--;
            }

            return true;
        }

        public static void main(String[] args) {
            List<Integer> numbers1 = new ArrayList<>(List.of(1, 2, 3, 2, 1));
            System.out.println("Is numbers1 a palindrome? " + isPalindrome(numbers1));

            List<Integer> numbers2 = new ArrayList<>(List.of(1, 2, 3, 4, 5));
            System.out.println("Is numbers2 a palindrome? " + isPalindrome(numbers2));
        }
    }


    /*

    To check if an ArrayList is a palindrome, you can follow the following approach in Java:


Explanation:
1. We define a class named `ArrayListPalindrome` to encapsulate the code related to checking if an ArrayList is a palindrome.
2. The `isPalindrome` method takes an ArrayList (`list`) as input and returns a boolean value indicating whether it is a palindrome or not.
3. We initialize two pointers, `start` and `end`, pointing to the first and last elements of the list, respectively.
4. We enter a while loop that continues until the `start` pointer is less than the `end` pointer.
5. In each iteration, we compare the elements at the `start` and `end` indices using the `equals` method.
6. If the elements are not equal, we return `false` because the list is not a palindrome.
7. We increment the `start` pointer and decrement the `end` pointer to continue checking the next pair of elements.
8. If the while loop completes without finding any unequal pair, we return `true` indicating that the list is a palindrome.
9. In the `main` method, we create two example lists (`numbers1` and `numbers2`).
10. We call the `isPalindrome` method for each list and print the result indicating whether it is a palindrome or not.

The code compares the elements from both ends of the list, moving towards the center, and checks if they are equal. If any pair of elements is found to be unequal, it immediately returns `false`, indicating that the list is not a palindrome. If all pairs are equal, it returns `true`, indicating that the list is a palindrome.

     */
