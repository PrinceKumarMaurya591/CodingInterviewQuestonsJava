package org.example.collections;
import java.util.ArrayList;
import java.util.List;
public class CheckIfAnArrayListContainsASubsequence8
{
        public static boolean containsSubsequence(List<Integer> list, List<Integer> subsequence) {
            int listSize = list.size();
            int subSize = subsequence.size();
            int listIndex = 0;
            int subIndex = 0;

            while (listIndex < listSize && subIndex < subSize) {
                if (list.get(listIndex).equals(subsequence.get(subIndex))) {
                    subIndex++;
                }
                listIndex++;
            }

            return subIndex == subSize;
        }

        public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            List<Integer> subsequence1 = new ArrayList<>();
            subsequence1.add(2);
            subsequence1.add(4);
            System.out.println(containsSubsequence(list, subsequence1));  // Output: true

            List<Integer> subsequence2 = new ArrayList<>();
            subsequence2.add(4);
            subsequence2.add(6);
            System.out.println(containsSubsequence(list, subsequence2));  // Output: false
            
            List<Integer> subsequence3 = new ArrayList<>();
            subsequence2.add(2);
            subsequence2.add(3);
            System.out.println(containsSubsequence(list, subsequence3));  // Output: true
            
        }
    }


    /*

    To check if an ArrayList contains a subsequence, you can follow the following approach in Java:


Explanation:
1. We define a class named `SubsequenceCheck` to encapsulate the code related to checking if an ArrayList contains a subsequence.
2. The `containsSubsequence` method takes two ArrayLists (`list` and `subsequence`) as input and returns a boolean value indicating whether the `list` contains the given `subsequence`.
3. We initialize variables `listSize` and `subSize` to store the sizes of the `list` and `subsequence`, respectively.
4. We initialize variables `listIndex` and `subIndex` to keep track of the current indices while traversing the `list` and `subsequence`.
5. We enter a while loop that continues as long as there are elements remaining in both the `list` and `subsequence`.
6. Inside the loop, we compare the elements at the current indices of the `list` and `subsequence`.
7. If the elements are equal, we increment the `subIndex` to move to the next element in the `subsequence`.
8. In each iteration, we always increment the `listIndex` to move forward in the `list`.
9. After traversing the `list` or the `subsequence` (or both), we check if the `subIndex` is equal to the `subSize`.
10. If `subIndex` is equal to `subSize`, it means all elements of the `subsequence` have been found in the `list`, and we return `true`.
11. If the loop ends without finding the complete `subsequence`, we return `false`.
12. In the `main` method, we create an ArrayList named `list` with sample elements.
13. We create two different subsequences (`subsequence1` and `subsequence2`) to test the `containsSubsequence` method.
14. We call the `containsSubsequence` method for each subsequence and print the result using `System.out.println()`.

This code checks if an ArrayList contains a subsequence by iteratively comparing the elements of the `list` and the `subsequence`. It moves through both lists simultaneously, incrementing indices based on matches. If the `subsequence` is fully matched, it returns `true`; otherwise, it returns `false`.

     */
