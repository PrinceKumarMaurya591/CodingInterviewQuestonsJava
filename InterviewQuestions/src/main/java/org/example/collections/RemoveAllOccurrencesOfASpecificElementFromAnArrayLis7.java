package org.example.collections;

import java.util.ArrayList;
import java.util.List;
public class RemoveAllOccurrencesOfASpecificElementFromAnArrayLis7 {



        public static void main(String[] args) {
            List<Integer> numbers = new ArrayList<>();
            numbers.add(2);
            numbers.add(5);
            numbers.add(3);
            numbers.add(2);
            numbers.add(8);
            numbers.add(2);

            int elementToRemove = 2;

            System.out.println("Before removal: " + numbers);

            // Remove all occurrences of the element
            while (numbers.contains(elementToRemove)) {
                numbers.remove(Integer.valueOf(elementToRemove));
            }

            System.out.println("After removal: " + numbers);
        }
    }

/*

To remove all occurrences of a specific element from an ArrayList in Java, you can use the following approach:


In this example, we have an ArrayList called `numbers` containing some integer values. We want to remove all occurrences of a specific element, which is `2` in this case.

Here's how the removal process works:

1. We iterate over the ArrayList using a while loop.
2. Inside the loop, we use the `contains()` method to check if the ArrayList still contains the element to remove.
3. If the element is present, we use the `remove()` method to remove the first occurrence of the element from the ArrayList.
   - Note: We wrap the elementToRemove in `Integer.valueOf()` to ensure we remove the object reference, not the index.
4. We repeat the loop until all occurrences of the element have been removed.
5. Finally, we print the ArrayList before and after the removal to verify the results.

The output of this code will be:
```
Before removal: [2, 5, 3, 2, 8, 2]
After removal: [5, 3, 8]
```

As you can see, all occurrences of the element `2` have been removed from the ArrayList.

 */
